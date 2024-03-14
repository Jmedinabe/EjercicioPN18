package com.mycompany.ejerciciopn18;
public class EjercicioPN18 {

    public static void main(String[] args) {
        int codigo_empleado;
        
        String nombres_empleado;
        
        double horas_de_trabajo, valor_hora, retencion_fuente, porcentaje_retencion, salario_bruto, salario_neto;
        
        codigo_empleado=1525;
        
        nombres_empleado="Juan Alberto";
        
        horas_de_trabajo = 48;
        
        valor_hora = 5000;
        
        porcentaje_retencion = 0.12;
        
        salario_bruto = horas_de_trabajo*valor_hora;
        
        retencion_fuente = salario_bruto*porcentaje_retencion;
        
        salario_neto = salario_bruto-retencion_fuente;
        
        System.out.println("El código del empleado es: " +codigo_empleado);
        
        System.out.println("El nombre del empleado es: " +nombres_empleado);
        
        System.out.println("El salario bruto es: " +salario_bruto);
        
        System.out.println("El salario neto es: " +salario_neto);
    }
}
