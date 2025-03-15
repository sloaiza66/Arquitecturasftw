class CorreoService {
    public void enviarCorreo(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);
    }
}

class UsuarioService {
    private CorreoService correoService;

    public UsuarioService() {
        this.correoService = new CorreoService(); // Dependencia directa
    }

    public void registrarUsuario(String nombre) {
        // Lógica para registrar usuario
        System.out.println("Usuario registrado: " + nombre);
        correoService.enviarCorreo("Bienvenido, " + nombre);
    }
}