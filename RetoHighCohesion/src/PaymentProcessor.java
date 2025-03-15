public class PaymentProcessor {

    public void processCreditCardPayment(String cardNumber, double amount) {
        // Verificación de la tarjeta
        System.out.println("Verificando tarjeta de crédito: " + cardNumber);

        // Realizar pago
        System.out.println("Procesando el pago de: " + amount);

        // Enviar confirmación por email
        sendEmailConfirmation();

        // Registrar la transacción en la base de datos
        saveTransactionToDatabase();
    }

    private void sendEmailConfirmation() {
        System.out.println("Enviando confirmación por email...");
    }

    private void saveTransactionToDatabase() {
        System.out.println("Guardando transacción en la base de datos...");
    }
}