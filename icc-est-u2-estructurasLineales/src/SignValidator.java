

public class SignValidator {
    private char var;

    public SignValidator(char var){
        this.var = var;
    }

    public char getVar() {
        return var;
    }

    public void setVar(char var) {
        this.var = var;
    }
    @Override
    public String toString(){
        return " " + var;
    }
    
}
