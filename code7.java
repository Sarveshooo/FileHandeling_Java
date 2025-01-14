/*
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javap java.io.File


Compiled from "File.java"
public class java.io.File implements java.io.Serializable, java.lang.Comparable<java.io.File> {
  public static final char separatorChar;
  public static final java.lang.String separator;
  public static final char pathSeparatorChar;
  public static final java.lang.String pathSeparator;
  static final boolean $assertionsDisabled;
  final boolean isInvalid();
  int getPrefixLength();
  public java.io.File(java.lang.String);
  public java.io.File(java.lang.String, java.lang.String);
  public java.io.File(java.io.File, java.lang.String);
  public java.io.File(java.net.URI);
  public java.lang.String getName();
  public java.lang.String getParent();
  public java.io.File getParentFile();
  public java.lang.String getPath();
  public boolean isAbsolute();
  public java.lang.String getAbsolutePath();
  public java.io.File getAbsoluteFile();
  public java.lang.String getCanonicalPath() throws java.io.IOException;
  public java.io.File getCanonicalFile() throws java.io.IOException;
  public java.net.URL toURL() throws java.net.MalformedURLException;
  public java.net.URI toURI();
  public boolean canRead();
  public boolean canWrite();
  public boolean exists();
  public boolean isDirectory();
  public boolean isFile();
  public boolean isHidden();
  public long lastModified();
  public long length();
  public boolean createNewFile() throws java.io.IOException;
  public boolean delete();
  public void deleteOnExit();
  public java.lang.String[] list();
  public java.lang.String[] list(java.io.FilenameFilter);
  public java.io.File[] listFiles();
  public java.io.File[] listFiles(java.io.FilenameFilter);
  public java.io.File[] listFiles(java.io.FileFilter);
  public boolean mkdir();
  public boolean mkdirs();
  public boolean renameTo(java.io.File);
  public boolean setLastModified(long);
  public boolean setReadOnly();
  public boolean setWritable(boolean, boolean);
  public boolean setWritable(boolean);
  public boolean setReadable(boolean, boolean);
  public boolean setReadable(boolean);
  public boolean setExecutable(boolean, boolean);
  public boolean setExecutable(boolean);
  public boolean canExecute();
  public static java.io.File[] listRoots();
  public long getTotalSpace();
  public long getFreeSpace();
  public long getUsableSpace();
  public static java.io.File createTempFile(java.lang.String, java.lang.String, java.io.File) throws java.io.IOException;      
  public static java.io.File createTempFile(java.lang.String, java.lang.String) throws java.io.IOException;
  public int compareTo(java.io.File);
  public boolean equals(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
  public java.nio.file.Path toPath();
  public int compareTo(java.lang.Object);
  static {};
}




PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javap java.io.FileWriter




Compiled from "FileWriter.java"
public class java.io.FileWriter extends java.io.OutputStreamWriter {
  public java.io.FileWriter(java.lang.String) throws java.io.IOException;
  public java.io.FileWriter(java.lang.String, boolean) throws java.io.IOException;
  public java.io.FileWriter(java.io.File) throws java.io.IOException;
  public java.io.FileWriter(java.io.File, boolean) throws java.io.IOException;
  public java.io.FileWriter(java.io.FileDescriptor);
}
PS C:\Users\sarvesh sakpal\Desktop\FileHandeling> javap java.io.FileWriter
*/