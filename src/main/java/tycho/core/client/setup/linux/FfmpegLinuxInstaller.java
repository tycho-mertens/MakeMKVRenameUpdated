package tycho.core.client.setup.linux;

import tycho.core.client.setup.Installer;
import java.util.logging.Logger;

public class FfmpegLinuxInstaller extends Installer {

    private static final Logger logger = Logger.getLogger(FfmpegLinuxInstaller.class.getName());


    @Override
    protected String url() {
        return "https://johnvansickle.com/ffmpeg/releases/ffmpeg-release-amd64-static.tar.xz";
    }

    @Override
    protected String fileName() {
        return "ffmpeg";
    }

//    @Override
//    public void setup() {
//        try {
//            File tar = new File(FileManager.getInstance().createTempDirectory(), "compressed.tar.xz");
//            FileUtils.copyURLToFile(stringToURL(url()), tar);
//            unzipLinux(tar, tar.getParentFile(), "tar", "xz");
//            copy(Arrays.stream(
//                    Objects.requireNonNull(
//                            tar.getParentFile().listFiles(File::isDirectory)
//                    )).toList().get(0).getAbsolutePath() + File.separator + fileName()
//                        , fileName());
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
}
