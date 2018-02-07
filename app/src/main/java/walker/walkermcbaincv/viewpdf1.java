package walker.walkermcbaincv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by walkermcbain on 2/7/18.
 */

public class viewpdf1 extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpdf1);

        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("WalkerMcBain_CV.pdf").load();


    }
}
