package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal=1;
    private int precio=500;
    private boolean estado;
    private int volumen=1;
    private static int numTV=0;

    private Control control;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }
    public TV(){
        numTV++;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal>= 1 && canal<= 120 && estado==true){
            this.canal = canal;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getVolumen() {
        return volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control){
        this.control = control;

    }

    public void setVolumen(int volumen) {
        if (volumen>=0 && volumen<= 7 && estado==true){
            this.volumen = volumen;
        }

    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        if(numTV>=0){
            TV.numTV = numTV;
        }

    }

    public void turnOn(){
        if(!estado){
            estado = true;
        }

    }
    public void turnOff(){
        if(estado){
            estado = false;
        }

    }

    public void canalUp(){
        if(estado==true && canal<120 && canal>=1){
            canal++;
        }
    }
    public void canalDown(){
        if(estado==true && canal>1 && canal <= 120){
            canal--;
        }
    }

    public void volumenUp(){
        if(estado==true && volumen<7 && volumen >= 0){
            volumen++;
        }
    }
    public void volumenDown(){
        if(estado && volumen>0){
            volumen--;
        }
    }
}
