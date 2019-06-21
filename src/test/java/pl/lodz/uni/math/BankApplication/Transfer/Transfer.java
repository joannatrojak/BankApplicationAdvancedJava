package pl.lodz.uni.math.BankApplication.Transfer;

import org.joda.money.Money;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Transfer {
    protected Money transferAmount = Money.parse("USD 0.0");
    @SuppressWarnings("SpellCheckingInspection")
    protected String dateOfTranfer;
    protected String numberOfTransaction;

    public void setAmountToBeTransfered(Money amountToBeTranfered) {
        this.transferAmount = transferAmount.plus(amountToBeTranfered);
    }

    public Money getAmountToBeTransfered() {
        return this.transferAmount;
    }

    @SuppressWarnings("unused")
    public void setDateOfTransfer() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");

        this.dateOfTranfer = formatter.format(new Date());
    }

    public String getTransferDate() {
        return this.dateOfTranfer;
    }

    public void setNumberOfTransaction(String numberOfTransactionToBeSet) {
        this.numberOfTransaction = numberOfTransactionToBeSet;
    }

    public String getNumberOfTransaction() {
        return numberOfTransaction;
    }

    //public abstract Money doTransfer(String typeOfTransfer) throws Exception;
}
