package PaymentService.services;

import PaymentService.entities.Contract;
import PaymentService.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double dividedValue = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate installmentDate = contract.getDate().plusMonths(i);
            double interestResult = onlinePaymentService.interest(dividedValue, i);
            double calculatedValue = onlinePaymentService.paymentFee(dividedValue + interestResult);
            double quota = dividedValue + interestResult + calculatedValue;
            contract.getInstallments().add(new Installment(installmentDate, quota));


        }

    }

}
