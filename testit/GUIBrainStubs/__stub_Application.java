/* This class was used for testing GUIBrain */

package fi.hu.cs.titokone;


public class __stub_Application {

protected MemoryLine[] code;
protected MemoryLine[] data;


public __stub_Application () {
  code = new MemoryLine[2];
  data = new MemoryLine[2];
  
  code[0] = new MemoryLine(321, "gfuei");
  code[1] = new MemoryLine(4121, "brbnrt");
  
  data[0] = new MemoryLine(65316, "h54qyh5q4");
  data[1] = new MemoryLine(534, "45hq425h");
}

public __stub_Application (MemoryLine[] code, MemoryLine[] data) {
  this.code = code;
  this.data = data;
}

public MemoryLine[] getCode() {
  return code;
}

public MemoryLine[] getInitialData() {
  return data;
}

public int getSymbolTable() {
  return 1;
}


}
