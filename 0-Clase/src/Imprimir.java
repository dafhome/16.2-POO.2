public class Imprimir {

    private String frase;
    private int enter;
    private int sleep;

    // public Imprimir(String frase, int enter, int sleep) {
    //     this.frase = frase;
    //     this.enter = enter;
    //     this.sleep = sleep;
    // }

    public void printLentamente(String frase, int enter, int sleep){
        try {
            for (int i = 0; i < frase.length(); i++) {
                System.out.print(frase.charAt(i));
                if (sleep == 1) {
                    Thread.sleep(20);
                }
            }
            if (enter == 1) {
                System.out.println(" ");
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    // public void setFrase(String frase){
    //     this.frase = frase;
    // }
    // public void setEnter(int enter){
    //     this.enter = enter;
    // }
    // public void setSleep(int sleep){
    //     this.sleep = sleep;
    // }

    // public String getFrase(){
    //     return this.frase;
    // }

    // public int getEnter(){
    //     return this.enter;
    // }

    // public int getSleep(){
    //     return this.sleep;
    // }

    // public void printLentamente(){
    //     String frase = this.frase;
    //     int enter = this.enter;
    //     int sleep = this.sleep;
    //     printLentamente(frase, enter, sleep);
    // }
    
}
