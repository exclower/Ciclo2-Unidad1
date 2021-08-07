public class CalcularInversion{
    private int tiempo;
    private double capital;
    private double interes;

    public CalcularInversion(){
        this.tiempo = 0;
        this.capital = 0.0;
        this.interes = 0.0;
    }

    public CalcularInversion(int pTiempo, double pCapital, double pInteres){
        this.tiempo = pTiempo;
        this.capital = pCapital;
        this.interes = pInteres;
    }
    public double calcularInteresSimple(){
        double interes = this.capital*(this.interes/100)*this.tiempo;
        return Math.round(interes);
    }
    public double calcularInteresCompuesto(){
        return (Math.round(this.capital*(Math.pow(1+(this.interes/100), this.tiempo)-1)))
    }
    public double compararInversion(){
        return (this.calcularInteresCompuesto()-this.calcularInteresCompuesto());
    }
    public double compararInversion(int ptiempo, double pcapital, double pinteres){
        this.tiempo = ptiempo;
        this.capital = pcapital;
        this.interes = pinteres;
        return (this.calcularInteresCompuesto()-this.calcularInteresCompuesto());
    }
}