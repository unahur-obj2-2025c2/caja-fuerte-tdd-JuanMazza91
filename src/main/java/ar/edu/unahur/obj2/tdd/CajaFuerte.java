package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
    private boolean estaAbierta;
    private int codigo = 1234;

    public CajaFuerte(boolean estaAbierta){
        this.estaAbierta = estaAbierta;
    }

    public boolean isEstaAbierta() {
        return estaAbierta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void abrirCaja(int unCodigo) throws Exception {
        if(!estaAbierta && codigo == unCodigo){
            estaAbierta = Boolean.TRUE;
        }
    } 
    public void cerrar(){
        estaAbierta = Boolean.FALSE;
    }
}

