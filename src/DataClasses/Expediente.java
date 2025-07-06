
package DataClasses;
import TDA.Simple.Cola;
import TDA.Simple.ListaEnlazada;

public class Expediente {
    private int Id;
    private String Prioridad;
    private DataInteresado Data;
    private String Asunto;
    private String DocumentoReferencia;
    private String FechaInicio;
    private String HoraInicio;
    private String FechaFin;
    private String HoraFin;
    private ListaEnlazada  SeguirExp;
    private Dependencia dependencia;
    private String DependenciaActual;
    private boolean finalizado;

    public Expediente(int Id, String Prioridad, DataInteresado Data, String Asunto, String DocumentoReferencia, String FechaInicio, String HoraInicio, String dependencia) {
        this.Id = Id;
        this.Prioridad = Prioridad;
        this.Data = Data;
        this.Asunto = Asunto;
        this.DocumentoReferencia = DocumentoReferencia;
        this.FechaInicio = FechaInicio;
        this.HoraInicio = HoraInicio;
        this.SeguirExp = new ListaEnlazada();
        this.DependenciaActual = "Administrador";
        
    }

    public String getDependenciaActual() {
        return DependenciaActual;
    }

    public void setDependenciaActual(String DependenciaActual) {
        this.DependenciaActual = DependenciaActual;
    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(String HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(String HoraFin) {
        this.HoraFin = HoraFin;
    }

    public Dependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }

    public DataInteresado getData() {
        return Data;
    }

    public void setData(DataInteresado Data) {
        this.Data = Data;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getDocumentoReferencia() {
        return DocumentoReferencia;
    }

    public void setDocumentoReferencia(String DocumentoReferencia) {
        this.DocumentoReferencia = DocumentoReferencia;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }

    public ListaEnlazada getSeguirExp() {
        return SeguirExp;
    }

    public void setSeguirExp(ListaEnlazada Seguimiento) {
        this.SeguirExp = Seguimiento;
    }

    public void finalizarTramite() {
    this.finalizado = true;
    }
}
