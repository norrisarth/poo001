package model;

import presenter.ScreenMoviePresenter;

public class PosterHelper {
    private String posterUrl;
    private PosterHelperListener listener;
    private Runnable runnable;
    AmazonConnectionManager connectionManager = new AmazonConnectionManager();

    public PosterHelper() {
        runnable = new Runnable() {
            @Override
            public void run() {
                // precisa abrir outro socket, ler o poster e chamar o listener.
//                Image response = connectionManager.requisitarPoster();
            }
        };
    }

    public void setListener(PosterHelperListener listener) {
        this.listener = listener;
    }

    public void requestPoster(String posterUrl) {
        this.posterUrl = posterUrl;
        (new Thread(runnable)).start();
    }


}
