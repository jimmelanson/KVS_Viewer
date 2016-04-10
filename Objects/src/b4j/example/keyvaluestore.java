package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class keyvaluestore extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.keyvaluestore", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.keyvaluestore.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public String _tempfolder = "";
public String _tempfile = "";
public b4j.example.main _main = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
 //BA.debugLineNum = 4;BA.debugLine="Private tempFolder = File.DirTemp, tempFile = \"ke";
_tempfolder = __c.File.getDirTemp();
_tempfile = "key_value_temp.dat";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 154;BA.debugLine="sql1.Close";
_sql1.Close();
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public boolean  _complete(boolean _success) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Private Sub complete(success As Boolean) As Boolea";
 //BA.debugLineNum = 196;BA.debugLine="If success Then";
if (_success) { 
 //BA.debugLineNum = 197;BA.debugLine="sql1.TransactionSuccessful";
_sql1.TransactionSuccessful();
 }else {
 //BA.debugLineNum = 199;BA.debugLine="Log(\"Error saving object: \" & LastException)";
__c.Log("Error saving object: "+BA.ObjectToString(__c.LastException(ba)));
 //BA.debugLineNum = 200;BA.debugLine="sql1.Rollback";
_sql1.Rollback();
 };
 //BA.debugLineNum = 202;BA.debugLine="Return success";
if (true) return _success;
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return false;
}
public boolean  _containskey(String _key) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
 //BA.debugLineNum = 89;BA.debugLine="Return sql1.ExecQuerySingleResult2(\"SELECT count(";
if (true) return (double)(Double.parseDouble(_sql1.ExecQuerySingleResult2("SELECT count(key) FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_key}))))>0;
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return false;
}
public String  _createtable() throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Private Sub CreateTable";
 //BA.debugLineNum = 187;BA.debugLine="sql1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS mai";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS main(key TEXT PRIMARY KEY, value NONE)");
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public String  _deleteall() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub DeleteAll";
 //BA.debugLineNum = 95;BA.debugLine="sql1.ExecNonQuery(\"DROP TABLE main\")";
_sql1.ExecNonQuery("DROP TABLE main");
 //BA.debugLineNum = 96;BA.debugLine="CreateTable";
_createtable();
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _getbitmap(String _key) throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _c = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _b = null;
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
 //BA.debugLineNum = 126;BA.debugLine="Public Sub GetBitmap(Key As String) As Image";
 //BA.debugLineNum = 127;BA.debugLine="Dim c As ResultSet = getCursor(Key)";
_c = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_c = _getcursor(_key);
 //BA.debugLineNum = 128;BA.debugLine="Dim b As Image";
_b = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 129;BA.debugLine="If c.NextRow = False Then";
if (_c.NextRow()==__c.False) { 
 //BA.debugLineNum = 130;BA.debugLine="c.Close";
_c.Close();
 //BA.debugLineNum = 131;BA.debugLine="Return b";
if (true) return _b;
 };
 //BA.debugLineNum = 133;BA.debugLine="Dim buffer() As Byte = c.GetBlob2(0)";
_buffer = _c.GetBlob2((int) (0));
 //BA.debugLineNum = 134;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 135;BA.debugLine="In.InitializeFromBytesArray(buffer, 0, buffer.Len";
_in.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
 //BA.debugLineNum = 136;BA.debugLine="b.Initialize2(In)";
_b.Initialize2((java.io.InputStream)(_in.getObject()));
 //BA.debugLineNum = 137;BA.debugLine="In.Close";
_in.Close();
 //BA.debugLineNum = 138;BA.debugLine="c.Close";
_c.Close();
 //BA.debugLineNum = 139;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.SQL.ResultSetWrapper  _getcursor(String _key) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Private Sub getCursor(Key As String) As ResultSet";
 //BA.debugLineNum = 178;BA.debugLine="Return sql1.ExecQuery2(\"SELECT value FROM main WH";
if (true) return _sql1.ExecQuery2("SELECT value FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_key}));
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public Object  _getencryptedobject(String _key,String _password) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Public Sub GetEncryptedObject(Key As String, Passw";
 //BA.debugLineNum = 149;BA.debugLine="Return getObjectInternal(Key, True, Password)";
if (true) return _getobjectinternal(_key,__c.True,_password);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(String _key) throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _c = null;
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
 //BA.debugLineNum = 112;BA.debugLine="Public Sub GetInputStream(Key As String) As InputS";
 //BA.debugLineNum = 113;BA.debugLine="Dim c As ResultSet = getCursor(Key)";
_c = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_c = _getcursor(_key);
 //BA.debugLineNum = 114;BA.debugLine="If c.NextRow = False Then";
if (_c.NextRow()==__c.False) { 
 //BA.debugLineNum = 115;BA.debugLine="c.Close";
_c.Close();
 //BA.debugLineNum = 116;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(__c.Null));
 };
 //BA.debugLineNum = 118;BA.debugLine="Dim buffer() As Byte = c.GetBlob2(0)";
_buffer = _c.GetBlob2((int) (0));
 //BA.debugLineNum = 119;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 120;BA.debugLine="In.InitializeFromBytesArray(buffer, 0, buffer.Len";
_in.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
 //BA.debugLineNum = 121;BA.debugLine="c.Close";
_c.Close();
 //BA.debugLineNum = 122;BA.debugLine="Return In";
if (true) return _in;
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public Object  _getobject(String _key) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Public Sub GetObject(Key As String) As Object";
 //BA.debugLineNum = 144;BA.debugLine="Return getObjectInternal(Key, False, \"\")";
if (true) return _getobjectinternal(_key,__c.False,"");
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public Object  _getobjectinternal(String _key,boolean _decrypt,String _password) throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _c = null;
byte[] _buffer = null;
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
Object _res = null;
 //BA.debugLineNum = 157;BA.debugLine="Private Sub getObjectInternal(Key As String, decry";
 //BA.debugLineNum = 158;BA.debugLine="Dim c As ResultSet = getCursor(Key)";
_c = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_c = _getcursor(_key);
 //BA.debugLineNum = 159;BA.debugLine="If c.NextRow = False Then";
if (_c.NextRow()==__c.False) { 
 //BA.debugLineNum = 160;BA.debugLine="c.Close";
_c.Close();
 //BA.debugLineNum = 161;BA.debugLine="Return Null";
if (true) return __c.Null;
 };
 //BA.debugLineNum = 163;BA.debugLine="Dim buffer() As Byte = c.GetBlob2(0)";
_buffer = _c.GetBlob2((int) (0));
 //BA.debugLineNum = 164;BA.debugLine="Dim raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
 //BA.debugLineNum = 165;BA.debugLine="raf.Initialize3(buffer, False)";
_raf.Initialize3(_buffer,__c.False);
 //BA.debugLineNum = 166;BA.debugLine="Dim res As Object";
_res = new Object();
 //BA.debugLineNum = 167;BA.debugLine="If decrypt Then";
if (_decrypt) { 
 //BA.debugLineNum = 168;BA.debugLine="res = raf.ReadEncryptedObject(password, raf.Curr";
_res = _raf.ReadEncryptedObject(_password,_raf.CurrentPosition);
 }else {
 //BA.debugLineNum = 170;BA.debugLine="res = raf.ReadObject(raf.CurrentPosition)";
_res = _raf.ReadObject(_raf.CurrentPosition);
 };
 //BA.debugLineNum = 172;BA.debugLine="raf.Close";
_raf.Close();
 //BA.debugLineNum = 173;BA.debugLine="c.Close";
_c.Close();
 //BA.debugLineNum = 174;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public String  _getsimple(String _key) throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _c = null;
String _res = "";
 //BA.debugLineNum = 100;BA.debugLine="Public Sub GetSimple(Key As String) As String";
 //BA.debugLineNum = 101;BA.debugLine="Dim c As ResultSet = getCursor(Key)";
_c = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_c = _getcursor(_key);
 //BA.debugLineNum = 102;BA.debugLine="If c.NextRow = False Then";
if (_c.NextRow()==__c.False) { 
 //BA.debugLineNum = 103;BA.debugLine="c.Close";
_c.Close();
 //BA.debugLineNum = 104;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 106;BA.debugLine="Dim res As String = c.GetString2(0)";
_res = _c.GetString2((int) (0));
 //BA.debugLineNum = 107;BA.debugLine="c.Close";
_c.Close();
 //BA.debugLineNum = 108;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _dir,String _filename) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize (Dir As String, FileName As";
 //BA.debugLineNum = 9;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
if (_sql1.IsInitialized()) { 
_sql1.Close();};
 //BA.debugLineNum = 10;BA.debugLine="sql1.InitializeSQLite(Dir, FileName, True)";
_sql1.InitializeSQLite(_dir,_filename,__c.True);
 //BA.debugLineNum = 11;BA.debugLine="CreateTable";
_createtable();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _insertquery(String _key,Object _value) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Private Sub insertQuery(Key As String, Value As Ob";
 //BA.debugLineNum = 182;BA.debugLine="sql1.ExecNonQuery2(\"INSERT INTO main VALUES(?, ?)";
_sql1.ExecNonQuery2("INSERT INTO main VALUES(?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key),_value}));
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _listkeys() throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _c = null;
anywheresoftware.b4a.objects.collections.List _res = null;
 //BA.debugLineNum = 77;BA.debugLine="Public Sub ListKeys As List";
 //BA.debugLineNum = 78;BA.debugLine="Dim c As ResultSet = sql1.ExecQuery(\"SELECT key F";
_c = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_c = _sql1.ExecQuery("SELECT key FROM main");
 //BA.debugLineNum = 79;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 80;BA.debugLine="res.Initialize";
_res.Initialize();
 //BA.debugLineNum = 81;BA.debugLine="Do While c.NextRow";
while (_c.NextRow()) {
 //BA.debugLineNum = 82;BA.debugLine="res.Add(c.GetString2(0))";
_res.Add((Object)(_c.GetString2((int) (0))));
 }
;
 //BA.debugLineNum = 84;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public boolean  _putbitmap(String _key,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _value) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _b = null;
 //BA.debugLineNum = 40;BA.debugLine="Public Sub PutBitmap(Key As String, Value As Image";
 //BA.debugLineNum = 41;BA.debugLine="Try";
try { //BA.debugLineNum = 42;BA.debugLine="start(Key)";
_start(_key);
 //BA.debugLineNum = 43;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 44;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
 //BA.debugLineNum = 45;BA.debugLine="Dim b As Image = Value";
_b = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_b = _value;
 //BA.debugLineNum = 46;BA.debugLine="b.WriteToStream(out)";
_b.WriteToStream((java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 47;BA.debugLine="insertQuery(Key, out.ToBytesArray)";
_insertquery(_key,(Object)(_out.ToBytesArray()));
 //BA.debugLineNum = 48;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 49;BA.debugLine="Return complete(True)";
if (true) return _complete(__c.True);
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 51;BA.debugLine="Return complete(False)";
if (true) return _complete(__c.False);
 };
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return false;
}
public boolean  _putencyptedobject(String _key,Object _value,String _password) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub PutEncyptedObject(Key As String, Value";
 //BA.debugLineNum = 36;BA.debugLine="Return putObjectInternal(Key, Value, True, Passwo";
if (true) return _putobjectinternal(_key,_value,__c.True,_password);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return false;
}
public boolean  _putinputstream(String _key,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _value) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 56;BA.debugLine="Public Sub PutInputStream(Key As String, Value As";
 //BA.debugLineNum = 57;BA.debugLine="Try";
try { //BA.debugLineNum = 58;BA.debugLine="start(Key)";
_start(_key);
 //BA.debugLineNum = 59;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 60;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
 //BA.debugLineNum = 61;BA.debugLine="File.Copy2(Value, out)";
__c.File.Copy2((java.io.InputStream)(_value.getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 62;BA.debugLine="Value.Close";
_value.Close();
 //BA.debugLineNum = 63;BA.debugLine="insertQuery(Key, out.ToBytesArray)";
_insertquery(_key,(Object)(_out.ToBytesArray()));
 //BA.debugLineNum = 64;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 65;BA.debugLine="Return complete(True)";
if (true) return _complete(__c.True);
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 67;BA.debugLine="Return complete(False)";
if (true) return _complete(__c.False);
 };
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return false;
}
public boolean  _putobject(String _key,Object _value) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub PutObject(Key As String, Value As Objec";
 //BA.debugLineNum = 31;BA.debugLine="Return putObjectInternal(Key, Value, False, \"\")";
if (true) return _putobjectinternal(_key,_value,__c.False,"");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return false;
}
public boolean  _putobjectinternal(String _key,Object _value,boolean _encrypt,String _password) throws Exception{
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
byte[] _buffer = null;
 //BA.debugLineNum = 205;BA.debugLine="Private Sub putObjectInternal(Key As String, Value";
 //BA.debugLineNum = 206;BA.debugLine="Try";
try { //BA.debugLineNum = 207;BA.debugLine="start(Key)";
_start(_key);
 //BA.debugLineNum = 208;BA.debugLine="Dim raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
 //BA.debugLineNum = 209;BA.debugLine="File.Delete(tempFolder, tempFile)";
__c.File.Delete(_tempfolder,_tempfile);
 //BA.debugLineNum = 210;BA.debugLine="raf.Initialize(tempFolder, tempFile, False)";
_raf.Initialize(_tempfolder,_tempfile,__c.False);
 //BA.debugLineNum = 211;BA.debugLine="If encrypt Then";
if (_encrypt) { 
 //BA.debugLineNum = 212;BA.debugLine="raf.WriteEncryptedObject(Value, password, raf.C";
_raf.WriteEncryptedObject(_value,_password,_raf.CurrentPosition);
 }else {
 //BA.debugLineNum = 214;BA.debugLine="raf.WriteObject(Value, True, raf.CurrentPositio";
_raf.WriteObject(_value,__c.True,_raf.CurrentPosition);
 };
 //BA.debugLineNum = 216;BA.debugLine="raf.Flush";
_raf.Flush();
 //BA.debugLineNum = 217;BA.debugLine="Dim buffer(raf.CurrentPosition) As Byte";
_buffer = new byte[(int) (_raf.CurrentPosition)];
;
 //BA.debugLineNum = 218;BA.debugLine="raf.ReadBytes(buffer, 0, buffer.Length, 0)";
_raf.ReadBytes(_buffer,(int) (0),_buffer.length,(long) (0));
 //BA.debugLineNum = 219;BA.debugLine="raf.Close";
_raf.Close();
 //BA.debugLineNum = 220;BA.debugLine="insertQuery(Key, buffer)";
_insertquery(_key,(Object)(_buffer));
 //BA.debugLineNum = 221;BA.debugLine="Return complete(True)";
if (true) return _complete(__c.True);
 } 
       catch (Exception e18) {
			ba.setLastException(e18); //BA.debugLineNum = 223;BA.debugLine="Return complete(False)";
if (true) return _complete(__c.False);
 };
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return false;
}
public boolean  _putsimple(String _key,Object _value) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Public Sub PutSimple(Key As String, Value As Objec";
 //BA.debugLineNum = 17;BA.debugLine="Try";
try { //BA.debugLineNum = 18;BA.debugLine="start(Key)";
_start(_key);
 //BA.debugLineNum = 19;BA.debugLine="insertQuery(Key, Value)";
_insertquery(_key,_value);
 //BA.debugLineNum = 20;BA.debugLine="Return complete(True)";
if (true) return _complete(__c.True);
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 22;BA.debugLine="Return complete(False)";
if (true) return _complete(__c.False);
 };
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return false;
}
public String  _remove(String _key) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub Remove(Key As String)";
 //BA.debugLineNum = 73;BA.debugLine="sql1.ExecNonQuery2(\"DELETE FROM main WHERE key =";
_sql1.ExecNonQuery2("DELETE FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key)}));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _start(String _key) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Private Sub start (Key As String)";
 //BA.debugLineNum = 191;BA.debugLine="sql1.BeginTransaction";
_sql1.BeginTransaction();
 //BA.debugLineNum = 192;BA.debugLine="sql1.ExecNonQuery2(\"DELETE FROM main WHERE key =";
_sql1.ExecNonQuery2("DELETE FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key)}));
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
