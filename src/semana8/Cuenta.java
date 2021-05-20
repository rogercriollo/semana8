package semana8;

import java.time.LocalDate;

public class Cuenta {


        private double saldo;
        protected String numero;
        private LocalDate fechaApertura;

        public Cuenta(double saldo, String numero) {
            setSaldo(saldo);
            this.numero = numero;
            fechaApertura = LocalDate.now();
        }

        public double getSaldo() {

            return saldo;
        }

        public void setSaldo(double saldo) {
            if ( !validarSaldoNoNegativo() ) {
                this.saldo = saldo;

            }else {
                throw new IllegalArgumentException("Saldo negativo");
            }
        }

        public String getNumero() {

            return numero;
        }

        public void setNumero(String numero) {

            this.numero = numero;
        }

        private boolean validarSaldoNoNegativo() {

            return saldo < 0;
        }

        public void depositar(double monto) {
            if (monto > 0 ) {
                this.saldo = this.saldo + monto;
            } else {
                throw new IllegalArgumentException("Monto Negativo");
            }
        }
    }
