package PaymentService.services;

import PaymentService.entities.Contract;
import PaymentService.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    public void processContract(Contract contract, Integer months) {

        for (int i = 1; months <= i; i++) {
            LocalDate installmentDate = contract.getDate().plusMonths(i);
            double dividedValue = contract.getTotalValue() / months;
            OnlinePaymentService paymentService = new PaypalService();
            double interestResult =  paymentService.interest(dividedValue, i);
            double calculatedValue = paymentService.paymentFee(dividedValue + interestResult);
            double quota = dividedValue + interestResult + calculatedValue;
            contract.getInstallments().add(new Installment(installmentDate, quota));

            System.out.println(installmentDate);
            System.out.println(calculatedValue);
            System.out.println(quota);


        }

    }

}
