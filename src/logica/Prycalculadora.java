/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author ARANGO
 */
public class Prycalculadora {

    abstract public class logica {

        protected int num1;
        protected int num2;
        protected int resultado;
        protected char operacion;
        protected int base;

        public logica() {
            this.num1 = 0;
            this.num2 = 0;
            this.resultado = 0;
            this.operacion = ' ';
        }

        public void setNum1(int n) {
            this.num1 = n;
        }

        public void setNum2(int n) {
            this.num1 = n;
        }

        public void setResultado(int n) {
            this.resultado = n;
        }

        public void setOperacion(char o) {
            this.operacion = o;
        }

        public int getNum1() {
            return this.num1;
        }

        public int getNum2() {
            return this.num2;
        }

        public int getResultado() {
            return this.resultado;
        }

        public char getOperacion() {
            return this.operacion;
        }

        public void suma() {
            this.resultado = this.num1 + this.num2;
        }

        public void resta() {
            this.resultado = this.num1 - this.num2;
        }

        public void multiplicacion() {
            this.resultado = this.num1 * this.num2;
        }

        public void division() {
            this.resultado = this.num1 / this.num2;
        }

        public void establecerNum1(String a) {
            int n = Integer.parseInt(a, base);
            this.setNum1(n);
        }

        public void establecerNum2(String b) {
            int n = Integer.parseInt(b, base);
            this.setNum2(n);
        }

        public String retornarNum1() {
            String cad = "";
            switch (base) {
                case 2:
                    cad = Integer.toBinaryString(num1);
                    break;
                case 8:
                    cad = Integer.toOctalString(num1);
                    break;
                case 10:
                    cad = String.valueOf(num1);
                    break;
                case 16:
                    cad = Integer.toHexString(num1);
                    break;
            }
            return cad;

        }

        public String retornarNum2() {
            String cad = "";
            switch (base) {
                case 2:
                    cad = Integer.toBinaryString(num2);
                    break;
                case 8:
                    cad = Integer.toOctalString(num2);
                    break;
                case 10:
                    cad = String.valueOf(num2);
                    break;
                case 16:
                    cad = Integer.toHexString(num2);
                    break;
            }
            return cad;
        }

        public String retornarResultado() {
            String cad = "";
            switch (base) {
                case 2:
                    cad = Integer.toBinaryString(resultado);
                    break;
                case 8:
                    cad = Integer.toOctalString(resultado);
                    break;
                case 10:
                    cad = String.valueOf(resultado);
                    break;
                case 16:
                    cad = Integer.toHexString(resultado);
                    break;
            }
            return cad;
        }

    }
}
