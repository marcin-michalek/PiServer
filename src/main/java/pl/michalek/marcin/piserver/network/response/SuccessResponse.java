package pl.michalek.marcin.piserver.network.response;

/**
 * Created by Marcin on 2015-02-14.
 */
public class SuccessResponse extends BaseResponse {
    public SuccessResponse(String message) {
        super(true, message, 0);
    }
}
