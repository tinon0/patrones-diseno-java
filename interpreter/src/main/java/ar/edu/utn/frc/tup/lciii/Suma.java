package ar.edu.utn.frc.tup.lciii;

public class Suma extends Expresion{
    private Expresion a;
    private  Expresion b;

    public Suma(Expresion a, Expresion b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int interpret() {
        return a.interpret() + b.interpret();
    }

    @Override
    public String toString(){
        return String.valueOf(interpret());
    }
}
