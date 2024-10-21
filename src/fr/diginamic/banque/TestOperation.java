package fr.diginamic.banque;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];
        operations[0] = new Credit("21/10/24", 22.9);
        operations[1] = new Debit("12/09/20", 200.7);
        operations[2] = new Credit("09/01/21", 56.88);
        operations[3] = new Debit("06/07/17", 23.99);

        for (Operation op : operations) {
            System.out.println(op.getType() + ":  " + op);
        }
        double sommeMontOpCredit = 0.0;
        double sommeMontOpdebit = 0.0;

        for (Operation op : operations) {
            String type1 = op.getType();
            double montOp = op.getMontantOperation();
            if (type1.equals("CREDIT")) {
                sommeMontOpCredit += montOp;
            }else {
                sommeMontOpdebit+= montOp;
            }
        }
        System.out.println("Total des crédits = " + sommeMontOpCredit);
        System.out.println("Total des débits = " + sommeMontOpdebit);
    }
}
