/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MaySM
 */
public class Music {
    String path, FileName, FileSize, extention;
    public Music(String p, String fn, String fs, String e) {
        this.path = p;
        this.FileName = fn;
        this.FileSize = fs;
        this.extention = e;
    }
    public String getPath() {
        return path;
    }
    public String getFileName() {
        return FileName;
    }
    public String getFileSize() {
        return FileSize;
    }
    public String getExtention() {
        return extention;
}


}
