package pl.michalek.marcin.piserver.response;

/**
 * Created by Marcin on 2015-02-14.
 */
public class LightsStateResponse extends BaseResponse {
    public boolean lightsOn;
    public LightsStateResponse(String message, boolean lightsOn) {
        super(true, message, 0);
    }
}
