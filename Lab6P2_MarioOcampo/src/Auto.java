
import java.awt.Color;
import java.util.ArrayList;

public class Auto {
    private String marca;
    private String modelo;
    private Color color;
    private int precio;
    private String origen;


    public Auto() {
    }

    public Auto(String marca, String modelo, Color color, int precio, String origen) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.origen = origen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }


    @Override
    public String toString() {
        return "Auto" + "\n"
                + " Marca = " + marca + "\n"
                + " Modelo = " + modelo + "\n"
                + " Color = " + color + "\n"
                + " Precio = " + precio + "\n"
                + " Origen = " + origen;
    }
    
    
    
}
