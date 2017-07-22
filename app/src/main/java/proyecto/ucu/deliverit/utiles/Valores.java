package proyecto.ucu.deliverit.utiles;

public class Valores {

    public static final String OK = "ok";
    public static final String CODIGO_EXITO = "0";
    public static final String CODIGO_ERROR_NULO_O_VACIO = "-1";
    public static final String CODIGO_ERROR_PASSWORD = "-2";
    public static final String CODIGO_ERROR_TELEFONO = "-3";
    public static final String CODIGO_ERROR_VALOR_INCORRECTO = "-4";
    public static final String MENSAJE_EXITO = "EXITO";
    public static final String MENSAJE_ERROR = "ERROR";
    public static final String DESCRIPCION_EXITO = "La operación se realizó correctamente";
    public static final String DESCRIPCION_ERROR_VACIO_O_NULO = "Campo vacío o nulo";
    public static final String DESCRIPCION_ERROR_LARGO_PASSWORD = "El largo de la contraseña debe ser mayor o igual a 8 caracteres";
    public static final String DESCIPRCION_ERROR_PASSWORD_SIN_NUMERO = "La contraseña debe contener al menos un número";
    public static final String DESCIPRCION_ERROR_PASSWORD_SIN_LETRA = "La contraseña debe contener al menos una letra";
    public static final String DESCIPRCION_ERROR_PASSWORD_SIN_CARACTER_ESPECIAL
            = "La contraseña debe contener al menos un caracter especial";
    public static final String DESCIPRCION_ERROR_TELEFONO = "El celular ingresado no es válido";
    public static final String DESCRIPCION_ERROR_VALOR_INCORRECTO = "Se ha encontrado un valor incorrecto";

    public static final int NOTIFICATION_ID = 1;
    public static final String NOTIFICATOIN_ID_TEXTO = "notificationID";
    public static final String VIAJE = "viaje";

    public static final String VIAJE_PARA_TI = "Tiene un nuevo viaje para ti!!";

    public static final String URL_WS = "http://192.168.1.41:8080/BackCore/ws/";
    public static final String URL_ACEPAR_VIAJE = URL_WS + "viaje/aceptarViaje/";
    public static final String URL_ACTUALIZAR_TOKEN = URL_WS + "delivery/actualizarToken/";
    public static final String URL_VIAJES_PUBLICADOS = URL_WS + "viaje/findPublicados/";
    public static final String URL_SOLICITAR_PEDIDOS = URL_WS + "pedido/solicitarPedidos/";
    public static final String URL_FINALIZAR_VIAJE = URL_WS + "viaje/finalizarViaje/";
    public static final String URL_LOGIN = URL_WS + "delivery/login/";
    public static final String URL_DIRECCIONES_VIAJES = URL_WS + "viaje/findSucursales";
    public static final String BARRA_DIAGONAL = "/";

    public static final String TU_UBICACION = "Estás aquí";

    private static final String POR_FAVOR_ESPERE = ", por favor espere...";
    public static final String CARGANDO_VIAJES = "Cargando Viajes" + POR_FAVOR_ESPERE;
    public static final String SOLICITANDO_VIAJE = "Solicitando Viaje" + POR_FAVOR_ESPERE;
    public static final String FINALIZAR_VIAJES = "Finalizando Viaje" + POR_FAVOR_ESPERE;
    public static final String LOGIN = "Ingresando" + POR_FAVOR_ESPERE;
    public static final String ACTUALIZANDO_UBICACION = "Actualizando ubicación" + POR_FAVOR_ESPERE;
    public static final String CREANDO_USUARIO = "Creando Usuario" + POR_FAVOR_ESPERE;
    public static final String ACTUALIZANDO_TOKEN = "Actualizando token" + POR_FAVOR_ESPERE;
    public static final String OBTENIENDO_PEDIDOS = "Obteniendo pedidos" + POR_FAVOR_ESPERE;
    public static final String OBTENIENDO_SUCURSALES = "Obteniendo direcciones" + POR_FAVOR_ESPERE;

    public static final String ACTIVITY_PADRE = "activityPadre";
    public static final String ACTIVITY_PADRE_MAIN = "mainActivity";
    public static final String ACTIVITY_PADRE_INGRESOS = "ingresosActivity";


    public static final String FOTO = "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";
}
