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
public anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
public b4j.example.main _main = null;
public b4j.example.createexamples2 _createexamples2 = null;
public b4j.example.createexamples _createexamples = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
 //BA.debugLineNum = 4;BA.debugLine="Private ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 112;BA.debugLine="sql1.Close";
_sql1.Close();
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public boolean  _containskey(String _key) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
 //BA.debugLineNum = 99;BA.debugLine="Return sql1.ExecQuerySingleResult2(\"SELECT count(";
if (true) return (double)(Double.parseDouble(_sql1.ExecQuerySingleResult2("SELECT count(key) FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_key}))))>0;
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return false;
}
public String  _createtable() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Private Sub CreateTable";
 //BA.debugLineNum = 118;BA.debugLine="sql1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS mai";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS main(key TEXT PRIMARY KEY, value NONE)");
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _deleteall() throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub DeleteAll";
 //BA.debugLineNum = 105;BA.debugLine="sql1.ExecNonQuery(\"DROP TABLE main\")";
_sql1.ExecNonQuery("DROP TABLE main");
 //BA.debugLineNum = 106;BA.debugLine="CreateTable";
_createtable();
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public Object  _get(String _key) throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
Object _result = null;
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Get(Key As String) As Object";
 //BA.debugLineNum = 23;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(\"SELECT val";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = _sql1.ExecQuery2("SELECT value FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_key}));
 //BA.debugLineNum = 24;BA.debugLine="Dim result As Object = Null";
_result = __c.Null;
 //BA.debugLineNum = 25;BA.debugLine="If rs.NextRow Then";
if (_rs.NextRow()) { 
 //BA.debugLineNum = 26;BA.debugLine="result = ser.ConvertBytesToObject(rs.GetBlob2(0)";
_result = _ser.ConvertBytesToObject(_rs.GetBlob2((int) (0)));
 };
 //BA.debugLineNum = 28;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 29;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public Object  _getdefault(String _key,Object _defaultvalue) throws Exception{
Object _res = null;
 //BA.debugLineNum = 32;BA.debugLine="Public Sub GetDefault(Key As String, DefaultValue";
 //BA.debugLineNum = 33;BA.debugLine="Dim res As Object = Get(Key)";
_res = _get(_key);
 //BA.debugLineNum = 34;BA.debugLine="If res = Null Then Return DefaultValue";
if (_res== null) { 
if (true) return _defaultvalue;};
 //BA.debugLineNum = 35;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public Object  _getencrypted(String _key,String _password) throws Exception{
anywheresoftware.b4x.object.B4XEncryption _cipher = null;
byte[] _b = null;
 //BA.debugLineNum = 48;BA.debugLine="Public Sub GetEncrypted (Key As String, Password A";
 //BA.debugLineNum = 52;BA.debugLine="Dim cipher As B4XCipher";
_cipher = new anywheresoftware.b4x.object.B4XEncryption();
 //BA.debugLineNum = 54;BA.debugLine="Dim b() As Byte = Get(Key)";
_b = (byte[])(_get(_key));
 //BA.debugLineNum = 55;BA.debugLine="If b = Null Then Return Null";
if (_b== null) { 
if (true) return __c.Null;};
 //BA.debugLineNum = 56;BA.debugLine="Return ser.ConvertBytesToObject(cipher.Decrypt(b,";
if (true) return _ser.ConvertBytesToObject(_cipher.Decrypt(_b,_password));
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _dir,String _filename) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize (Dir As String, FileName As";
 //BA.debugLineNum = 9;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
if (_sql1.IsInitialized()) { 
_sql1.Close();};
 //BA.debugLineNum = 11;BA.debugLine="sql1.InitializeSQLite(Dir, FileName, True)";
_sql1.InitializeSQLite(_dir,_filename,__c.True);
 //BA.debugLineNum = 15;BA.debugLine="CreateTable";
_createtable();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _listkeys() throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _c = null;
anywheresoftware.b4a.objects.collections.List _res = null;
 //BA.debugLineNum = 86;BA.debugLine="Public Sub ListKeys As List";
 //BA.debugLineNum = 87;BA.debugLine="Dim c As ResultSet = sql1.ExecQuery(\"SELECT key F";
_c = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_c = _sql1.ExecQuery("SELECT key FROM main");
 //BA.debugLineNum = 88;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 89;BA.debugLine="res.Initialize";
_res.Initialize();
 //BA.debugLineNum = 90;BA.debugLine="Do While c.NextRow";
while (_c.NextRow()) {
 //BA.debugLineNum = 91;BA.debugLine="res.Add(c.GetString2(0))";
_res.Add((Object)(_c.GetString2((int) (0))));
 }
;
 //BA.debugLineNum = 93;BA.debugLine="c.Close";
_c.Close();
 //BA.debugLineNum = 94;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public String  _put(String _key,Object _value) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Put(Key As String, Value As Object)";
 //BA.debugLineNum = 19;BA.debugLine="sql1.ExecNonQuery2(\"INSERT OR REPLACE INTO main V";
_sql1.ExecNonQuery2("INSERT OR REPLACE INTO main VALUES(?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key),(Object)(_ser.ConvertObjectToBytes(_value))}));
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _putencrypted(String _key,Object _value,String _password) throws Exception{
anywheresoftware.b4x.object.B4XEncryption _cipher = null;
 //BA.debugLineNum = 38;BA.debugLine="Public Sub PutEncrypted (Key As String, Value As O";
 //BA.debugLineNum = 42;BA.debugLine="Dim cipher As B4XCipher";
_cipher = new anywheresoftware.b4x.object.B4XEncryption();
 //BA.debugLineNum = 44;BA.debugLine="Put(Key, cipher.Encrypt(ser.ConvertObjectToBytes(";
_put(_key,(Object)(_cipher.Encrypt(_ser.ConvertObjectToBytes(_value),_password)));
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _remove(String _key) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub Remove(Key As String)";
 //BA.debugLineNum = 82;BA.debugLine="sql1.ExecNonQuery2(\"DELETE FROM main WHERE key =";
_sql1.ExecNonQuery2("DELETE FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key)}));
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
