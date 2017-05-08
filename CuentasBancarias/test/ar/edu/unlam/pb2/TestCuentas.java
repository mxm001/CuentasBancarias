package ar.edu.unlam.pb2;


import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;


public class TestCuentas {
	@Test
	public void TestCuentaExtraccion() {
		Cuenta MiCuenta =new Cuenta();
		MiCuenta.setSaldo(40.00);
		MiCuenta.hacerExtraccion(20.00);
		Assert.assertEquals(20.00, MiCuenta.getSaldo());
	}
	@Test
	public void TestCuentaCorrienteExtraccion() {
		CuentaCorriente MiCuenta =new CuentaCorriente();
		MiCuenta.setSaldo(40.00);
		MiCuenta.hacerExtraccion(20.00);
		Assert.assertEquals(20.00, MiCuenta.getSaldo());
	}
	@Test
	public void TestCajaAhorroExtraccion() {
		CajaAhorro MiCuenta =new CajaAhorro();
		MiCuenta.setSaldo(40.00);
		MiCuenta.hacerExtraccion(20.00);
		Assert.assertEquals(20.00, MiCuenta.getSaldo());
	}
	@Test
	public void TestCuentaDeposito() {
		Cuenta MiCuenta =new Cuenta();
		MiCuenta.hacerDeposito(20.00);
		Assert.assertEquals(20.00, MiCuenta.getSaldo());
	}
	@Test
	public void TestCuentaCorrienteDeposito() {
		CuentaCorriente MiCuenta =new CuentaCorriente();
		MiCuenta.hacerDeposito(20.00);
		Assert.assertEquals(20.00, MiCuenta.getSaldo());
	}
	@Test
	public void TestCajaAhorroDeposito() {
		CajaAhorro MiCuenta =new CajaAhorro();
		MiCuenta.hacerDeposito(20.00);
		Assert.assertEquals(20.00, MiCuenta.getSaldo());
	}
}
