package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    static int numTV=0;

    private Control control;



    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
    }
    public TV(){
        canal = 1;
        volumen = 1;
        precio = 500;
        ++numTV;

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
        if (canal>= 1 && canal<= 120){
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

    public void setControl(Control control){
        this.control = control;

    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
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
        if(estado && canal<120){
            ++canal;
        }
    }
    public void canalDown(){
        if(estado && canal>1){
            --canal;
        }
    }

    public void volumenUp(){
        if(estado && volumen<7){
            ++volumen;
        }
    }
    public void volumenDown(){
        if(estado && volumen>0){
            --volumen;
        }
    }
}
