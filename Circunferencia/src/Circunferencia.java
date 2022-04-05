
public class Circunferencia {
	  private double raio;
	  private double xPC;
	  private double yPC;
	  private double xPComp;
	  private double yPComp;

	  public Circunferencia(){ }
	  
	  public Circunferencia(double raio, double xPC, double yPC, double xPComp, double yPComp){
	    this.raio = raio;
	    this.xPC = xPC;
	    this.yPC = yPC;
	    this.xPComp = xPComp;
	    this.yPComp = yPComp;
	  }

	  public double getRaio(){
	    return raio;
	  }
	  
	  public void setRaio(double raio){
	    this.raio = raio;
	  }

	  public double getXPC(){ //get do Ponto Central X
	    return xPC;
	  }
	  
	  public void setXPC(double xPC){
	    this.xPC = xPC;
	  }

	  public double getYPC(){ //get do Ponto central Y
	    return yPC;
	  }
	  
	  public void setYPC(double yPC){ 
	    this.yPC = yPC;
	  }

	  public double getXPComp(){ // get do Ponto de compara��o do X
	    return xPComp;
	  }
	  
	  public void setXPComp(double xPComp){
	    this.xPComp = xPComp;
	  }

	  public double getYPontoComparacao(){  //get do Ponto de compara��o do Y
	    return yPComp;
	  }
	  
	  public void setYPComp(double yPComp){
	    this.yPComp = yPComp;
	  }
	  
	  public void calcularDistanciaEntreDoisPontos(){
	    double distancia = Math.sqrt((this.xPComp-this.xPC)*(this.xPComp-this.xPC) + 
	    		(this.yPComp-this.yPComp)*(this.yPComp-this.yPC));

	    System.out.println(distancia);
	    
	    System.out.println("Se usar as coordenadas de X' = " + this.getXPComp() + " e as de Y' = " + this.getYPontoComparacao()
	    + " em compara��o ao ponto central X = " + this.getXPC() + " e Y = " + this.getYPC() +
	    " com Raio de = " + this.getRaio() + " resultar� em: ");
	    
	    if(raio == distancia){
      System.out.println();
	    	System.out.println("Caso n�mero 1: ");
		    System.out.println("O ponto est� dentro do circulo e tem valor igual ao raio");
		    }
	    
	    else if(raio > distancia){
    System.out.println();
		  System.out.println("Caso n�mero 3: ");
			System.out.println("O ponto est� dentro do circulo");
		    }
	    else{
        System.out.println();
		      System.out.println("Caso n�mero 2: ");
		      System.out.println("O ponto est� fora do circulo");
		    }
	  }
	}