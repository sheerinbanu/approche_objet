package fr.diginamic.banque;

public class Credit extends Operation{

    public Credit(String dateOperation, double montantOperation) {
        super(dateOperation, montantOperation);
    }
    @Override
    public String getType() {
        return "CREDIT";
    }
}
