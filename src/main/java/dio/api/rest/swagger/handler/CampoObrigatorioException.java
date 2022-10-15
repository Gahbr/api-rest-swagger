package dio.api.rest.swagger.handler;

public class CampoObrigatorioException extends BusinessException{

    public CampoObrigatorioException(String campo) {
        super("o campo %s é obrigatório",campo);
    }
}
