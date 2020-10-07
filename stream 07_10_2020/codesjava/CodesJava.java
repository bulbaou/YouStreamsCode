package codesjava;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class CodesJava {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    public static void main(String[] args) throws Exception {
        testWrite();


    }
    public static void testWrite(){
        Mat image = Imgcodecs.imread("D:/tmp/txt.bmp");
        Imgcodecs.imwrite("D:/tmp/test2.jpg", image, new MatOfInt(Imgcodecs.CV_IMWRITE_JPEG_QUALITY,0));
    }
    public static void testDCP() {
        Mat image = Imgcodecs.imread("D:/tmp/kot.jpg", Imgcodecs.IMREAD_GRAYSCALE);
        Mat image2 = new Mat(image.rows(), image.cols(), CvType.CV_32FC1);
        for (int i = 0; i < image.rows(); i++) {
            for (int j = 0; j < image.cols(); j++) {
                image2.put(i, j, image.get(i, j)[0]);
            }
        }
        Core.dct(image2, image2);
        Imgcodecs.imwrite("D:/tmp/test.bmp", image2);
    }
    public static void testColors() {
        Mat image = Imgcodecs.imread("D:/tmp/kot.jpg");
        for (int i = 0; i < image.rows(); i++) {
            for (int j = 0; j < image.cols(); j++) {
                double B = image.get(i, j)[0];
                double G = image.get(i, j)[1];
                double R = image.get(i, j)[2];

                //конверсия из BGR в YCrCb
                double delta = 128;
                double Y = 0.299 * R + 0.587 * G + 0.114 * B;
                double Cb = (B - Y) * 0.564 + delta;
                double Cr = (R - Y) * 0.713 + delta;
                //Y=0;
                //Cb=0;
                //Cr=0;
                //конверсия из YCrCb в BGR                
                B = Y + 1.773 * (Cb - delta);
                G = Y - 0.714 * (Cr - delta) - 0.344 * (Cb - delta);
                R = Y + 1.403 * (Cr - delta);

                image.put(i, j, new double[]{0, 0, Cr});
            }
        }
        Imgcodecs.imwrite("D:/tmp/test.jpg", image);
    }
}
