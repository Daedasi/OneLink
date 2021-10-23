
package domain;


public class SubArea {
    
    private int idSubArea;
    private String label;

    public SubArea() {
    }

    public SubArea(int idSubArea, String label) {
        this.idSubArea = idSubArea;
        this.label = label;
    }

    public int getIdSubArea() {
        return idSubArea;
    }

    public void setIdSubArea(int idSubArea) {
        this.idSubArea = idSubArea;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    
    
}
