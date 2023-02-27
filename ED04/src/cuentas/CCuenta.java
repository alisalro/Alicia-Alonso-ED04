package cuentas;

public class CCuenta {
/**
 * En esta clase están varios métodos que simulan el comportamiento de un cajero 
 * @author alicia
 * @version 1.0
 * @since 1
*/
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
/**
 * En el método CCuenta se setean los valores de nombre, cuenta y saldo
 * @param nom Nombre del titular
 * @param cue Cuenta
 * @param sal Saldo
 * @param tipo Tipo cuenta
*/
    	
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    public double estado()
    {
/**
 * En el método estado se obtiene de valor de retorno el saldo
 * @return saldo
*/
    	
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
/**
 * En el método ingresar se controla que la cantidad a ingresar sea mayor de 0
 * @param cantidad
 * @exception cantidad > 0
*/
    	
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
/**
 * En el método retirar se controla que la cantidad a retirar sea menor o igual a la disponible en la cuenta
 * @param cantidad
 * @exception cantidad <= 0
*/
    	
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}



