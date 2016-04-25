package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class createexamples extends Object{
public static createexamples mostCurrent = new createexamples();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.createexamples", null);
		ba.loadHtSubs(createexamples.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.createexamples", ba);
		}
	}
    public static Class<?> getObject() {
		return createexamples.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.keyvaluestorev1 _thiskvs = null;
public static b4j.example.main _main = null;
public static b4j.example.createexamples2 _createexamples2 = null;
public static String  _createencrypted() throws Exception{
anywheresoftware.b4a.objects.collections.Map _maptest = null;
String _strbio = "";
anywheresoftware.b4a.objects.collections.List _listtemp = null;
 //BA.debugLineNum = 45;BA.debugLine="Sub createencrypted";
 //BA.debugLineNum = 46;BA.debugLine="thiskvs.Initialize(Main.GetDataFolder(\"KVSViewer\"";
_thiskvs._initialize(ba,_main._getdatafolder("KVSViewer"),"kvs1_example_encrypted.dat");
 //BA.debugLineNum = 47;BA.debugLine="Dim mapTest As Map";
_maptest = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 48;BA.debugLine="mapTest.Initialize";
_maptest.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="mapTest.Put(\"Name\", \"Jim Melanson\")";
_maptest.Put((Object)("Name"),(Object)("Jim Melanson"));
 //BA.debugLineNum = 50;BA.debugLine="mapTest.Put(\"Email\", \"jmelanson1965@gmail.com\")";
_maptest.Put((Object)("Email"),(Object)("jmelanson1965@gmail.com"));
 //BA.debugLineNum = 51;BA.debugLine="mapTest.Put(\"City\", \"Cobourg\")";
_maptest.Put((Object)("City"),(Object)("Cobourg"));
 //BA.debugLineNum = 52;BA.debugLine="mapTest.Put(\"Province\", \"Ontario\")";
_maptest.Put((Object)("Province"),(Object)("Ontario"));
 //BA.debugLineNum = 53;BA.debugLine="mapTest.Put(\"Postal Code\", \"K9A-4J8\")";
_maptest.Put((Object)("Postal Code"),(Object)("K9A-4J8"));
 //BA.debugLineNum = 54;BA.debugLine="mapTest.Put(\"Bio URL\", \"https://about.me/jim.mela";
_maptest.Put((Object)("Bio URL"),(Object)("https://about.me/jim.melanson"));
 //BA.debugLineNum = 55;BA.debugLine="mapTest.Put(\"Writing website\", \"http://www.jimmel";
_maptest.Put((Object)("Writing website"),(Object)("http://www.jimmelanson.ca"));
 //BA.debugLineNum = 56;BA.debugLine="thiskvs.PutEncyptedObject(\"Contact Details as Map";
_thiskvs._putencyptedobject("Contact Details as Map",(Object)(_maptest.getObject()),"1357");
 //BA.debugLineNum = 57;BA.debugLine="Dim strBio As String";
_strbio = "";
 //BA.debugLineNum = 58;BA.debugLine="strBio = \"Poet, programmer, procrastinator, sci-f";
_strbio = "Poet, programmer, procrastinator, sci-fi geek, coffee snob, actor, writer.";
 //BA.debugLineNum = 59;BA.debugLine="strBio =  strBio & CRLF & CRLF & \"A devoted Chris";
_strbio = _strbio+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"A devoted Christian, Jim is a quiet and thoughtful man who tends to think deeply and act slowly. Much of this inner reflection and self-assessment shows up in his writing. “Capturing what truly motivates us,” is how Jim describes his approach to both fiction and non-fiction. With a passion for sci-fi (Edgar Rice Burroughs is his favourite sci-fi author) and for non-fiction Christian literature, Jim explores both with his writing. This author has a very direct and sometimes in-your-face way of writing. He tries to always use conversational language and as one test reader of a work in progress put it, 'made the complexities of space flight seem almost understandable.'";
 //BA.debugLineNum = 60;BA.debugLine="strBio =  strBio & CRLF & CRLF & \"Jim was born on";
_strbio = _strbio+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Jim was born on the East Coast of Canada. He grew up on a small island in the Bay of Fundy called Campobello Island. His teenage years were spent in the bustling seaport city of Saint John, NB and in the west island area of Montreal, PQ. Jim read his first novel by Laura Ingalls Wilder at the age of eight and this began his love affair with the written word. While mostly writing for school and in his later years the workplace, Jim’s first foray into personal writing as a child was poetry. These and other poetic scribbling’s provided the content for his first book, I Apologize for Nothing, self-published in April, 2014.";
 //BA.debugLineNum = 61;BA.debugLine="strBio =  strBio & CRLF & CRLF & \"Trying his hand";
_strbio = _strbio+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Trying his hand at short stories, Jim didn’t pursue this as far as he wanted to. Life, a child, a career with the Police Service and a part-time business authoring software all got in the way. In his 40’s, Jim turned his hand back to writing, mainly on topics surrounding self-development, spirituality, and Reiki. None of these really satisfied that craving for creativity. In 2013, Jim decided to pursue his creative yearnings and began writing for pleasure. Drawing on a solid work ethic from his experience authoring technical manuals and writing business proposals, Jim found writing for himself to be liberating and enjoyable. While working on his first fiction novel, he kept getting sidetracked by other ideas. He dusted off an old stage play he had written and published this under the title Mama’s Slippers, with the hopes of attracting production interest. He currently continues work on both science fiction and Christian themed projects.";
 //BA.debugLineNum = 62;BA.debugLine="strBio =  strBio & CRLF & CRLF & \"Jim is single a";
_strbio = _strbio+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Jim is single and shares his home with his cat Cleo. They live in a small comfortable home just outside Cobourg.";
 //BA.debugLineNum = 63;BA.debugLine="thiskvs.PutEncyptedObject(\"Multiline Biography\",";
_thiskvs._putencyptedobject("Multiline Biography",(Object)(_strbio),"1357");
 //BA.debugLineNum = 64;BA.debugLine="thiskvs.PutEncyptedObject(\"Single line\", \"Leaders";
_thiskvs._putencyptedobject("Single line",(Object)("Leadership is the art of getting people to do what you want them to do, without them realizing you want them to do it. - Winston Churchill"),"1357");
 //BA.debugLineNum = 65;BA.debugLine="Dim listTemp As List";
_listtemp = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 66;BA.debugLine="listTemp.Initialize";
_listtemp.Initialize();
 //BA.debugLineNum = 67;BA.debugLine="listTemp.Add(\"Red\")";
_listtemp.Add((Object)("Red"));
 //BA.debugLineNum = 68;BA.debugLine="listTemp.Add(\"Orange\")";
_listtemp.Add((Object)("Orange"));
 //BA.debugLineNum = 69;BA.debugLine="listTemp.Add(\"Yellow\")";
_listtemp.Add((Object)("Yellow"));
 //BA.debugLineNum = 70;BA.debugLine="listTemp.Add(\"Green\")";
_listtemp.Add((Object)("Green"));
 //BA.debugLineNum = 71;BA.debugLine="listTemp.Add(\"Blue\")";
_listtemp.Add((Object)("Blue"));
 //BA.debugLineNum = 72;BA.debugLine="listTemp.Add(\"Indigo\")";
_listtemp.Add((Object)("Indigo"));
 //BA.debugLineNum = 73;BA.debugLine="listTemp.Add(\"Violet\")";
_listtemp.Add((Object)("Violet"));
 //BA.debugLineNum = 74;BA.debugLine="listTemp.Add(\"Mnemonic: Run, Oh You Great Big Iri";
_listtemp.Add((Object)("Mnemonic: Run, Oh You Great Big Irish Varlet"));
 //BA.debugLineNum = 75;BA.debugLine="thiskvs.PutEncyptedObject(\"A Big Prime Number\", 1";
_thiskvs._putencyptedobject("A Big Prime Number",(Object)(108293),"1357");
 //BA.debugLineNum = 76;BA.debugLine="thiskvs.PutEncyptedObject(\"Colour List\", listTemp";
_thiskvs._putencyptedobject("Colour List",(Object)(_listtemp.getObject()),"1357");
 //BA.debugLineNum = 77;BA.debugLine="thiskvs.PutEncyptedObject(\"This file is encrypted";
_thiskvs._putencyptedobject("This file is encrypted",(Object)("True"),"1357");
 //BA.debugLineNum = 78;BA.debugLine="thiskvs.Close";
_thiskvs._close();
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public static String  _createunencrypted() throws Exception{
anywheresoftware.b4a.objects.collections.Map _maptest = null;
String _strbio = "";
anywheresoftware.b4a.objects.collections.List _listtemp = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub createunencrypted";
 //BA.debugLineNum = 8;BA.debugLine="If thiskvs.IsInitialized = False Then";
if (_thiskvs.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 9;BA.debugLine="thiskvs.Initialize(Main.GetDataFolder(\"KVSViewer";
_thiskvs._initialize(ba,_main._getdatafolder("KVSViewer"),"kvs1_example_unencrypted.dat");
 };
 //BA.debugLineNum = 11;BA.debugLine="Dim mapTest As Map";
_maptest = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 12;BA.debugLine="mapTest.Initialize";
_maptest.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="mapTest.Put(\"Name\", \"Jim Melanson\")";
_maptest.Put((Object)("Name"),(Object)("Jim Melanson"));
 //BA.debugLineNum = 14;BA.debugLine="mapTest.Put(\"Email\", \"jmelanson1965@gmail.com\")";
_maptest.Put((Object)("Email"),(Object)("jmelanson1965@gmail.com"));
 //BA.debugLineNum = 15;BA.debugLine="mapTest.Put(\"City\", \"Cobourg\")";
_maptest.Put((Object)("City"),(Object)("Cobourg"));
 //BA.debugLineNum = 16;BA.debugLine="mapTest.Put(\"Province\", \"Ontario\")";
_maptest.Put((Object)("Province"),(Object)("Ontario"));
 //BA.debugLineNum = 17;BA.debugLine="mapTest.Put(\"Postal Code\", \"K9A-4J8\")";
_maptest.Put((Object)("Postal Code"),(Object)("K9A-4J8"));
 //BA.debugLineNum = 18;BA.debugLine="mapTest.Put(\"Bio URL\", \"https://about.me/jim.mela";
_maptest.Put((Object)("Bio URL"),(Object)("https://about.me/jim.melanson"));
 //BA.debugLineNum = 19;BA.debugLine="mapTest.Put(\"Writing website\", \"http://www.jimmel";
_maptest.Put((Object)("Writing website"),(Object)("http://www.jimmelanson.ca"));
 //BA.debugLineNum = 20;BA.debugLine="thiskvs.PutObject(\"Contact Details as Map\", mapTe";
_thiskvs._putobject("Contact Details as Map",(Object)(_maptest.getObject()));
 //BA.debugLineNum = 21;BA.debugLine="Dim strBio As String";
_strbio = "";
 //BA.debugLineNum = 22;BA.debugLine="strBio = \"Poet, programmer, procrastinator, sci-f";
_strbio = "Poet, programmer, procrastinator, sci-fi geek, coffee snob, actor, writer.";
 //BA.debugLineNum = 23;BA.debugLine="strBio =  strBio & CRLF & CRLF & \"A devoted Chris";
_strbio = _strbio+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"A devoted Christian, Jim is a quiet and thoughtful man who tends to think deeply and act slowly. Much of this inner reflection and self-assessment shows up in his writing. “Capturing what truly motivates us,” is how Jim describes his approach to both fiction and non-fiction. With a passion for sci-fi (Edgar Rice Burroughs is his favourite sci-fi author) and for non-fiction Christian literature, Jim explores both with his writing. This author has a very direct and sometimes in-your-face way of writing. He tries to always use conversational language and as one test reader of a work in progress put it, 'made the complexities of space flight seem almost understandable.'";
 //BA.debugLineNum = 24;BA.debugLine="strBio =  strBio & CRLF & CRLF & \"Jim was born on";
_strbio = _strbio+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Jim was born on the East Coast of Canada. He grew up on a small island in the Bay of Fundy called Campobello Island. His teenage years were spent in the bustling seaport city of Saint John, NB and in the west island area of Montreal, PQ. Jim read his first novel by Laura Ingalls Wilder at the age of eight and this began his love affair with the written word. While mostly writing for school and in his later years the workplace, Jim’s first foray into personal writing as a child was poetry. These and other poetic scribbling’s provided the content for his first book, I Apologize for Nothing, self-published in April, 2014.";
 //BA.debugLineNum = 25;BA.debugLine="strBio =  strBio & CRLF & CRLF & \"Trying his hand";
_strbio = _strbio+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Trying his hand at short stories, Jim didn’t pursue this as far as he wanted to. Life, a child, a career with the Police Service and a part-time business authoring software all got in the way. In his 40’s, Jim turned his hand back to writing, mainly on topics surrounding self-development, spirituality, and Reiki. None of these really satisfied that craving for creativity. In 2013, Jim decided to pursue his creative yearnings and began writing for pleasure. Drawing on a solid work ethic from his experience authoring technical manuals and writing business proposals, Jim found writing for himself to be liberating and enjoyable. While working on his first fiction novel, he kept getting sidetracked by other ideas. He dusted off an old stage play he had written and published this under the title Mama’s Slippers, with the hopes of attracting production interest. He currently continues work on both science fiction and Christian themed projects.";
 //BA.debugLineNum = 26;BA.debugLine="strBio =  strBio & CRLF & CRLF & \"Jim is single a";
_strbio = _strbio+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Jim is single and shares his home with his cat Cleo. They live in a small comfortable home just outside Cobourg.";
 //BA.debugLineNum = 27;BA.debugLine="thiskvs.PutSimple(\"Multiline Biography\", strBio)";
_thiskvs._putsimple("Multiline Biography",(Object)(_strbio));
 //BA.debugLineNum = 28;BA.debugLine="thiskvs.PutSimple(\"Single line\", \"Leadership is t";
_thiskvs._putsimple("Single line",(Object)("Leadership is the art of getting people to do what you want them to do, without them realizing you want them to do it. - Winston Churchill"));
 //BA.debugLineNum = 29;BA.debugLine="Dim listTemp As List";
_listtemp = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 30;BA.debugLine="listTemp.Initialize";
_listtemp.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="listTemp.Add(\"Red\")";
_listtemp.Add((Object)("Red"));
 //BA.debugLineNum = 32;BA.debugLine="listTemp.Add(\"Orange\")";
_listtemp.Add((Object)("Orange"));
 //BA.debugLineNum = 33;BA.debugLine="listTemp.Add(\"Yellow\")";
_listtemp.Add((Object)("Yellow"));
 //BA.debugLineNum = 34;BA.debugLine="listTemp.Add(\"Green\")";
_listtemp.Add((Object)("Green"));
 //BA.debugLineNum = 35;BA.debugLine="listTemp.Add(\"Blue\")";
_listtemp.Add((Object)("Blue"));
 //BA.debugLineNum = 36;BA.debugLine="listTemp.Add(\"Indigo\")";
_listtemp.Add((Object)("Indigo"));
 //BA.debugLineNum = 37;BA.debugLine="listTemp.Add(\"Violet\")";
_listtemp.Add((Object)("Violet"));
 //BA.debugLineNum = 38;BA.debugLine="listTemp.Add(\"Mnemonic: Run, Oh You Great Big Iri";
_listtemp.Add((Object)("Mnemonic: Run, Oh You Great Big Irish Varlet"));
 //BA.debugLineNum = 39;BA.debugLine="thiskvs.PutSimple(\"A Big Prime Number\", 108293)";
_thiskvs._putsimple("A Big Prime Number",(Object)(108293));
 //BA.debugLineNum = 40;BA.debugLine="thiskvs.PutObject(\"Colour List\", listTemp)";
_thiskvs._putobject("Colour List",(Object)(_listtemp.getObject()));
 //BA.debugLineNum = 41;BA.debugLine="thiskvs.PutSimple(\"This file is unencrypted\", \"Tr";
_thiskvs._putsimple("This file is unencrypted",(Object)("True"));
 //BA.debugLineNum = 42;BA.debugLine="thiskvs.Close";
_thiskvs._close();
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Dim thiskvs As KeyValueStoreV1";
_thiskvs = new b4j.example.keyvaluestorev1();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
