package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            BA.Log("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 950, 650);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static b4j.example.keyvaluestorev1 _kvs1 = null;
public static b4j.example.keyvaluestore _kvs2 = null;
public static b4j.example.keyvaluestorev1 _kvsrecentitems = null;
public static b4j.example.dialogs8 _dialogue8 = null;
public static String _strexistingfilepath = "";
public static String _strexistingfilename = "";
public static anywheresoftware.b4j.objects.TableViewWrapper _tabledataview = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpassword = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnselectfile = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnreload = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _combofilefield = null;
public static int _tableviewrowindex = 0;
public static int _tableviewcolindex = 0;
public static Object _tableviewcell = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtaddeditkeyname = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _txtaddeditvalue = null;
public static anywheresoftware.b4j.objects.StatusBarWrapper _statusbar = null;
public static anywheresoftware.b4a.objects.collections.Map _mapmenus = null;
public static anywheresoftware.b4a.objects.collections.Map _mapcontextmenus = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static boolean _boolisrecentitems = false;
public static boolean _boolignorecomoboboxselectedindexchange = false;
public static anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper _radiokvsv1 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper _radiokvsv2 = null;
public static anywheresoftware.b4a.objects.collections.List _radiolist = null;
public static String _strappname = "";
public static b4j.example.createexamples2 _createexamples2 = null;
public static b4j.example.createexamples _createexamples = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 40;BA.debugLine="If File.exists(GetDataFolder(\"KVSViewer\"), \"kvs1_";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_getdatafolder("KVSViewer"),"kvs1_example_unencrypted.dat")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 41;BA.debugLine="createexamples.createunencrypted";
_createexamples._createunencrypted();
 };
 //BA.debugLineNum = 43;BA.debugLine="If File.exists(GetDataFolder(\"KVSViewer\"), \"kvs1_";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_getdatafolder("KVSViewer"),"kvs1_example_encrypted.dat")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 44;BA.debugLine="createexamples.createencrypted";
_createexamples._createencrypted();
 };
 //BA.debugLineNum = 46;BA.debugLine="If File.Exists(GetDataFolder(\"KVSViewer\"), \"kvs2_";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_getdatafolder("KVSViewer"),"kvs2_example_unencrypted.dat")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 47;BA.debugLine="createexamples2.createunencrypted2";
_createexamples2._createunencrypted2();
 };
 //BA.debugLineNum = 49;BA.debugLine="If File.Exists(GetDataFolder(\"KVSViewer\"), \"kvs2_";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_getdatafolder("KVSViewer"),"kvs2_example_encrypted.dat")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 50;BA.debugLine="createexamples2.createencrypted2";
_createexamples2._createencrypted2();
 };
 //BA.debugLineNum = 52;BA.debugLine="RedirectOutput(File.DirApp, \"logs.txt\")";
_redirectoutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"logs.txt");
 //BA.debugLineNum = 53;BA.debugLine="strAppName = \"KVSViewer\"";
_strappname = "KVSViewer";
 //BA.debugLineNum = 54;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 55;BA.debugLine="MainForm.SetFormStyle(\"UNIFIED\")";
_mainform.SetFormStyle("UNIFIED");
 //BA.debugLineNum = 56;BA.debugLine="MainForm.RootPane.LoadLayout(\"main_form\") 'Load t";
_mainform.getRootPane().LoadLayout(ba,"main_form");
 //BA.debugLineNum = 57;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"Gla";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Glasses.png").getObject()));
 //BA.debugLineNum = 58;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 59;BA.debugLine="boolIgnoreComoboBoxSelectedIndexChange = False";
_boolignorecomoboboxselectedindexchange = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 60;BA.debugLine="statusBar.Initialize(\"statusBar\")";
_statusbar.Initialize(ba,"statusBar");
 //BA.debugLineNum = 61;BA.debugLine="MainForm.RootPane.AddNode(statusBar, 0, 0, -1, 30";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_statusbar.getObject()),0,0,-1,30);
 //BA.debugLineNum = 62;BA.debugLine="MainForm.RootPane.SetAnchors(statusBar, 0, -1, 0,";
_mainform.getRootPane().SetAnchors((javafx.scene.Node)(_statusbar.getObject()),0,-1,0,0);
 //BA.debugLineNum = 63;BA.debugLine="radiolist.Initialize";
_radiolist.Initialize();
 //BA.debugLineNum = 64;BA.debugLine="radiolist.Add(radioKVSV1)";
_radiolist.Add((Object)(_radiokvsv1.getObject()));
 //BA.debugLineNum = 65;BA.debugLine="radiolist.Add(radioKVSV2)";
_radiolist.Add((Object)(_radiokvsv2.getObject()));
 //BA.debugLineNum = 66;BA.debugLine="radioKVSV1.GroupRadioButtons(radiolist)";
_radiokvsv1.GroupRadioButtons(_radiolist);
 //BA.debugLineNum = 67;BA.debugLine="If File.Exists(GetDataFolder(strAppName), \"remrad";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_getdatafolder(_strappname),"remradkvsv2.txt")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 68;BA.debugLine="radioKVSV2.Selected = True";
_radiokvsv2.setSelected(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 70;BA.debugLine="radioKVSV1.Selected = True";
_radiokvsv1.setSelected(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 72;BA.debugLine="statusBar.Text = \"KSV Viewer 1.0\"";
_statusbar.setText("KSV Viewer 1.0");
 //BA.debugLineNum = 73;BA.debugLine="dialogue8.Initialize";
_dialogue8._initialize(ba);
 //BA.debugLineNum = 74;BA.debugLine="tableDataView.SetColumnHeader(0, \"Key\")";
_tabledataview.SetColumnHeader((int) (0),"Key");
 //BA.debugLineNum = 75;BA.debugLine="tableDataView.SetColumnHeader(1, \"Contents\")";
_tabledataview.SetColumnHeader((int) (1),"Contents");
 //BA.debugLineNum = 76;BA.debugLine="tableDataView.SetColumnWidth(0, 200.00)";
_tabledataview.SetColumnWidth((int) (0),200.00);
 //BA.debugLineNum = 77;BA.debugLine="tableDataView.SetColumnWidth(1, 740.00)";
_tabledataview.SetColumnWidth((int) (1),740.00);
 //BA.debugLineNum = 78;BA.debugLine="tableDataView.SetColumnSortable(0, True)";
_tabledataview.SetColumnSortable((int) (0),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 79;BA.debugLine="tableDataView.SetColumnSortable(1, True)";
_tabledataview.SetColumnSortable((int) (1),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 80;BA.debugLine="tableDataView.SingleCellSelection = True";
_tabledataview.setSingleCellSelection(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 81;BA.debugLine="kvsRecentItems.Initialize(GetDataFolder(strAppNam";
_kvsrecentitems._initialize(ba,_getdatafolder(_strappname),"recentitems.data");
 //BA.debugLineNum = 82;BA.debugLine="If kvsRecentItems.ContainsKey(\"ExistingFilePath\")";
if (_kvsrecentitems._containskey("ExistingFilePath")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 83;BA.debugLine="strExistingFilePath = kvsRecentItems.GetSimple(\"";
_strexistingfilepath = _kvsrecentitems._getsimple("ExistingFilePath");
 };
 //BA.debugLineNum = 85;BA.debugLine="mapMenus.Initialize";
_mapmenus.Initialize();
 //BA.debugLineNum = 86;BA.debugLine="CollectMenuItems(mapMenus, MenuBar1.Menus)";
_collectmenuitems(_mapmenus,_menubar1.getMenus());
 //BA.debugLineNum = 87;BA.debugLine="mapContextMenus.Initialize";
_mapcontextmenus.Initialize();
 //BA.debugLineNum = 88;BA.debugLine="CollectContextMenuItems(mapContextMenus, tableDat";
_collectcontextmenuitems(_mapcontextmenus,_tabledataview.getContextMenu().getMenuItems());
 //BA.debugLineNum = 89;BA.debugLine="MenuDisableItems";
_menudisableitems();
 //BA.debugLineNum = 90;BA.debugLine="PopulateMainFormComboBox";
_populatemainformcombobox();
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public static String  _btnaddedit_action() throws Exception{
String _strpath = "";
String _strfile = "";
 //BA.debugLineNum = 123;BA.debugLine="Sub btnAddEdit_Action";
 //BA.debugLineNum = 124;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 125;BA.debugLine="If comboFileField.Items.Get(comboFileField.Selec";
if ((_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())).equals((Object)("")) == false) { 
 //BA.debugLineNum = 126;BA.debugLine="Dim strPath As String";
_strpath = "";
 //BA.debugLineNum = 127;BA.debugLine="Dim strFile As String";
_strfile = "";
 //BA.debugLineNum = 128;BA.debugLine="strPath = File.GetFileParent(comboFileField.Ite";
_strpath = anywheresoftware.b4a.keywords.Common.File.GetFileParent(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 129;BA.debugLine="strFile = File.GetName(comboFileField.Items.Get";
_strfile = anywheresoftware.b4a.keywords.Common.File.GetName(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 130;BA.debugLine="If File.IsDirectory(strPath, strFile) = True Th";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_strpath,_strfile)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 131;BA.debugLine="dialogue8.WarningDialog(\"File Selection Error\"";
_dialogue8._warningdialog("File Selection Error","No File Selected","You must select a file to import.");
 //BA.debugLineNum = 132;BA.debugLine="MenuDisableItems";
_menudisableitems();
 //BA.debugLineNum = 133;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 }else {
 //BA.debugLineNum = 135;BA.debugLine="ChangeStatusBarMessage(\"File Loading ...\")";
_changestatusbarmessage("File Loading ...");
 //BA.debugLineNum = 136;BA.debugLine="strExistingFilePath = strPath";
_strexistingfilepath = _strpath;
 //BA.debugLineNum = 137;BA.debugLine="strExistingFileName = strFile";
_strexistingfilename = _strfile;
 //BA.debugLineNum = 138;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 139;BA.debugLine="If kvs1.IsInitialized = True Then";
if (_kvs1.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 140;BA.debugLine="kvs1.Close";
_kvs1._close();
 };
 //BA.debugLineNum = 142;BA.debugLine="kvs1.Initialize(strPath, strFile)";
_kvs1._initialize(ba,_strpath,_strfile);
 //BA.debugLineNum = 143;BA.debugLine="If txtPassword.Text <> \"\" Then";
if ((_txtpassword.getText()).equals("") == false) { 
 //BA.debugLineNum = 144;BA.debugLine="kvs1.PutEncyptedObject(txtAddEditKeyname.Tex";
_kvs1._putencyptedobject(_txtaddeditkeyname.getText(),(Object)(_txtaddeditvalue.getText()),_txtpassword.getText());
 }else {
 //BA.debugLineNum = 146;BA.debugLine="kvs1.PutSimple(txtAddEditKeyname.Text, txtAd";
_kvs1._putsimple(_txtaddeditkeyname.getText(),(Object)(_txtaddeditvalue.getText()));
 };
 }else {
 //BA.debugLineNum = 149;BA.debugLine="If kvs2.IsInitialized = True Then";
if (_kvs2.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 150;BA.debugLine="kvs2.Close";
_kvs2._close();
 };
 //BA.debugLineNum = 152;BA.debugLine="kvs2.Initialize(strPath, strFile)";
_kvs2._initialize(ba,_strpath,_strfile);
 //BA.debugLineNum = 153;BA.debugLine="If txtPassword.Text <> \"\" Then";
if ((_txtpassword.getText()).equals("") == false) { 
 //BA.debugLineNum = 154;BA.debugLine="kvs2.PutEncrypted(txtAddEditKeyname.Text, tx";
_kvs2._putencrypted(_txtaddeditkeyname.getText(),(Object)(_txtaddeditvalue.getText()),_txtpassword.getText());
 }else {
 //BA.debugLineNum = 156;BA.debugLine="kvs2.Put(txtAddEditKeyname.Text, txtAddEditV";
_kvs2._put(_txtaddeditkeyname.getText(),(Object)(_txtaddeditvalue.getText()));
 };
 };
 //BA.debugLineNum = 159;BA.debugLine="btnReload_Action";
_btnreload_action();
 //BA.debugLineNum = 160;BA.debugLine="txtAddEditKeyname.Text = \"\"";
_txtaddeditkeyname.setText("");
 //BA.debugLineNum = 161;BA.debugLine="txtAddEditValue.Text = \"\"";
_txtaddeditvalue.setText("");
 //BA.debugLineNum = 162;BA.debugLine="MenuEnableItems";
_menuenableitems();
 //BA.debugLineNum = 163;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 //BA.debugLineNum = 164;BA.debugLine="ChangeStatusBarMessage(\"Key/Value pair updated";
_changestatusbarmessage("Key/Value pair updated. If the key did not exist it was added.");
 //BA.debugLineNum = 165;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 166;BA.debugLine="kvs1.Close";
_kvs1._close();
 }else {
 //BA.debugLineNum = 168;BA.debugLine="kvs2.Close";
_kvs2._close();
 };
 };
 };
 };
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public static String  _btnreload_action() throws Exception{
String _strpath = "";
String _strfile = "";
 //BA.debugLineNum = 179;BA.debugLine="Sub btnReload_Action";
 //BA.debugLineNum = 180;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 181;BA.debugLine="If comboFileField.Items.Get(comboFileField.Selec";
if ((_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())).equals((Object)("")) == false) { 
 //BA.debugLineNum = 182;BA.debugLine="Dim strPath As String";
_strpath = "";
 //BA.debugLineNum = 183;BA.debugLine="Dim strFile As String";
_strfile = "";
 //BA.debugLineNum = 184;BA.debugLine="strPath = File.GetFileParent(comboFileField.Ite";
_strpath = anywheresoftware.b4a.keywords.Common.File.GetFileParent(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 185;BA.debugLine="strFile = File.GetName(comboFileField.Items.Get";
_strfile = anywheresoftware.b4a.keywords.Common.File.GetName(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 186;BA.debugLine="If File.IsDirectory(strPath, strFile) = True Th";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_strpath,_strfile)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 187;BA.debugLine="fx.Msgbox(MainForm, \"You must select a file to";
_fx.Msgbox(_mainform,"You must select a file to import.","No File Selected");
 //BA.debugLineNum = 188;BA.debugLine="MenuDisableItems";
_menudisableitems();
 //BA.debugLineNum = 189;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 }else {
 //BA.debugLineNum = 191;BA.debugLine="ChangeStatusBarMessage(\"File Loading ...\")";
_changestatusbarmessage("File Loading ...");
 //BA.debugLineNum = 192;BA.debugLine="strExistingFilePath = strPath";
_strexistingfilepath = _strpath;
 //BA.debugLineNum = 193;BA.debugLine="strExistingFileName = strFile";
_strexistingfilename = _strfile;
 //BA.debugLineNum = 194;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 195;BA.debugLine="If kvs1.IsInitialized = True Then";
if (_kvs1.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 196;BA.debugLine="kvs1.Close";
_kvs1._close();
 };
 //BA.debugLineNum = 198;BA.debugLine="kvs1.Initialize(strPath, strFile)";
_kvs1._initialize(ba,_strpath,_strfile);
 }else {
 //BA.debugLineNum = 200;BA.debugLine="If kvs2.IsInitialized = True Then";
if (_kvs2.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 201;BA.debugLine="kvs2.Close";
_kvs2._close();
 };
 //BA.debugLineNum = 203;BA.debugLine="kvs2.Initialize(strPath, strFile)";
_kvs2._initialize(ba,_strpath,_strfile);
 };
 //BA.debugLineNum = 205;BA.debugLine="LoadKVSData";
_loadkvsdata();
 //BA.debugLineNum = 206;BA.debugLine="MenuEnableItems";
_menuenableitems();
 //BA.debugLineNum = 207;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 //BA.debugLineNum = 208;BA.debugLine="ChangeStatusBarMessage(\"File reloaded.\")";
_changestatusbarmessage("File reloaded.");
 //BA.debugLineNum = 209;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 210;BA.debugLine="kvs1.Close";
_kvs1._close();
 }else {
 //BA.debugLineNum = 212;BA.debugLine="kvs2.Close";
_kvs2._close();
 };
 };
 };
 };
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return "";
}
public static String  _btnselectfile_action() throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub btnSelectFile_Action";
 //BA.debugLineNum = 176;BA.debugLine="LoadFile";
_loadfile();
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public static String  _changestatusbarmessage(String _strmessage) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Sub ChangeStatusBarMessage(strMessage As String)";
 //BA.debugLineNum = 116;BA.debugLine="statusBar.Text = strMessage";
_statusbar.setText(_strmessage);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public static String  _clearrecentitemslist() throws Exception{
int _i = 0;
 //BA.debugLineNum = 845;BA.debugLine="Sub ClearRecentItemsList";
 //BA.debugLineNum = 846;BA.debugLine="If comboFileField.Items.Size > 1 Then";
if (_combofilefield.getItems().getSize()>1) { 
 //BA.debugLineNum = 847;BA.debugLine="If dialogue8.ConfirmationDialog(\"Recent Items Li";
if (_dialogue8._confirmationdialog("Recent Items List","Clear Recent Items List","Do you really want to empty the recent items list?")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 848;BA.debugLine="kvsRecentItems.DeleteAll";
_kvsrecentitems._deleteall();
 //BA.debugLineNum = 850;BA.debugLine="For i = comboFileField.Items.Size - 1 To 0 Step";
{
final int step4 = (int) (-1);
final int limit4 = (int) (0);
for (_i = (int) (_combofilefield.getItems().getSize()-1) ; (step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4); _i = ((int)(0 + _i + step4)) ) {
 //BA.debugLineNum = 851;BA.debugLine="If comboFileField.SelectedIndex <> i Then";
if (_combofilefield.getSelectedIndex()!=_i) { 
 //BA.debugLineNum = 852;BA.debugLine="comboFileField.Items.RemoveAt(i)";
_combofilefield.getItems().RemoveAt(_i);
 };
 }
};
 //BA.debugLineNum = 855;BA.debugLine="boolIsRecentItems = False";
_boolisrecentitems = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 856;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 };
 };
 //BA.debugLineNum = 859;BA.debugLine="End Sub";
return "";
}
public static String  _collectcontextmenuitems(anywheresoftware.b4a.objects.collections.Map _contextmenus,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper _mn = null;
 //BA.debugLineNum = 411;BA.debugLine="Private Sub CollectContextMenuItems(ContextMenus A";
 //BA.debugLineNum = 412;BA.debugLine="For Each mi As MenuItem In Items";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize();
for (int index1 = 0;index1 < groupLen1 ;index1++){
_mi.setObject((javafx.scene.control.MenuItem)(group1.Get(index1)));
 //BA.debugLineNum = 413;BA.debugLine="If mi.Tag <> Null And mi.Tag <> \"\" Then Conte";
if (_mi.getTag()!= null && (_mi.getTag()).equals((Object)("")) == false) { 
_contextmenus.Put(_mi.getTag(),(Object)(_mi.getObject()));};
 //BA.debugLineNum = 414;BA.debugLine="If mi Is Menu Then";
if (_mi.getObjectOrNull() instanceof javafx.scene.control.Menu) { 
 //BA.debugLineNum = 415;BA.debugLine="Dim mn As Menu = mi";
_mn = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper();
_mn.setObject((javafx.scene.control.Menu)(_mi.getObject()));
 //BA.debugLineNum = 416;BA.debugLine="CollectContextMenuItems(ContextMenus, mn.Me";
_collectcontextmenuitems(_contextmenus,_mn.getMenuItems());
 };
 }
;
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return "";
}
public static String  _collectmenuitems(anywheresoftware.b4a.objects.collections.Map _menus,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper _mn = null;
 //BA.debugLineNum = 401;BA.debugLine="Private Sub CollectMenuItems(Menus As Map, Items A";
 //BA.debugLineNum = 402;BA.debugLine="For Each mi As MenuItem In Items";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize();
for (int index1 = 0;index1 < groupLen1 ;index1++){
_mi.setObject((javafx.scene.control.MenuItem)(group1.Get(index1)));
 //BA.debugLineNum = 403;BA.debugLine="If mi.Tag <> Null And mi.Tag <> \"\" Then Menus";
if (_mi.getTag()!= null && (_mi.getTag()).equals((Object)("")) == false) { 
_menus.Put(_mi.getTag(),(Object)(_mi.getObject()));};
 //BA.debugLineNum = 404;BA.debugLine="If mi Is Menu Then";
if (_mi.getObjectOrNull() instanceof javafx.scene.control.Menu) { 
 //BA.debugLineNum = 405;BA.debugLine="Dim mn As Menu = mi";
_mn = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper();
_mn.setObject((javafx.scene.control.Menu)(_mi.getObject()));
 //BA.debugLineNum = 406;BA.debugLine="CollectMenuItems(Menus, mn.MenuItems)";
_collectmenuitems(_menus,_mn.getMenuItems());
 };
 }
;
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return "";
}
public static String  _combofilefield_selectedindexchanged(int _index,Object _value) throws Exception{
String _strfile = "";
 //BA.debugLineNum = 226;BA.debugLine="Sub comboFileField_SelectedIndexChanged(Index As I";
 //BA.debugLineNum = 227;BA.debugLine="If boolIgnoreComoboBoxSelectedIndexChange = False";
if (_boolignorecomoboboxselectedindexchange==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 228;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 229;BA.debugLine="If comboFileField.Items.Get(comboFileField.Sele";
if ((_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())).equals((Object)("")) == false) { 
 //BA.debugLineNum = 230;BA.debugLine="Dim strFile As String";
_strfile = "";
 //BA.debugLineNum = 231;BA.debugLine="strExistingFilePath = File.GetFileParent(combo";
_strexistingfilepath = anywheresoftware.b4a.keywords.Common.File.GetFileParent(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 232;BA.debugLine="strExistingFileName = File.GetName(comboFileFi";
_strexistingfilename = anywheresoftware.b4a.keywords.Common.File.GetName(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 233;BA.debugLine="kvsRecentItems.PutSimple(\"ExistingFilePath\", s";
_kvsrecentitems._putsimple("ExistingFilePath",(Object)(_strexistingfilepath));
 //BA.debugLineNum = 234;BA.debugLine="strFile = File.GetName(comboFileField.Items.Ge";
_strfile = anywheresoftware.b4a.keywords.Common.File.GetName(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 235;BA.debugLine="If File.IsDirectory(strExistingFilePath, strFi";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_strexistingfilepath,_strfile)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 236;BA.debugLine="fx.Msgbox(MainForm, \"You must select a file t";
_fx.Msgbox(_mainform,"You must select a file to import.","No File Selected");
 //BA.debugLineNum = 237;BA.debugLine="MenuDisableItems";
_menudisableitems();
 }else {
 //BA.debugLineNum = 239;BA.debugLine="ChangeStatusBarMessage(\"File Loading ...\")";
_changestatusbarmessage("File Loading ...");
 //BA.debugLineNum = 240;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 241;BA.debugLine="If kvs1.IsInitialized = True Then";
if (_kvs1.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 242;BA.debugLine="kvs1.Close";
_kvs1._close();
 };
 //BA.debugLineNum = 244;BA.debugLine="kvs1.Initialize(strExistingFilePath, strExis";
_kvs1._initialize(ba,_strexistingfilepath,_strexistingfilename);
 }else {
 //BA.debugLineNum = 246;BA.debugLine="If kvs2.IsInitialized = True Then";
if (_kvs2.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 247;BA.debugLine="kvs2.Close";
_kvs2._close();
 };
 //BA.debugLineNum = 249;BA.debugLine="kvs2.Initialize(strExistingFilePath, strExis";
_kvs2._initialize(ba,_strexistingfilepath,_strexistingfilename);
 };
 //BA.debugLineNum = 251;BA.debugLine="LoadKVSData";
_loadkvsdata();
 //BA.debugLineNum = 252;BA.debugLine="MenuEnableItems";
_menuenableitems();
 //BA.debugLineNum = 253;BA.debugLine="ChangeStatusBarMessage(\"File loaded: \" & comb";
_changestatusbarmessage("File loaded: "+BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 254;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 255;BA.debugLine="kvs1.Close";
_kvs1._close();
 }else {
 //BA.debugLineNum = 257;BA.debugLine="kvs2.Close";
_kvs2._close();
 };
 };
 };
 }else {
 //BA.debugLineNum = 262;BA.debugLine="tableDataView.Items.Clear";
_tabledataview.getItems().Clear();
 //BA.debugLineNum = 263;BA.debugLine="MenuDisableItems";
_menudisableitems();
 //BA.debugLineNum = 264;BA.debugLine="ChangeStatusBarMessage(\"\")";
_changestatusbarmessage("");
 };
 };
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return "";
}
public static String  _combofilefield_valuechanged(Object _value) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub comboFileField_ValueChanged (Value As Object)";
 //BA.debugLineNum = 220;BA.debugLine="If Value = Null Then";
if (_value== null) { 
 //BA.debugLineNum = 221;BA.debugLine="menuClearData_Action";
_menucleardata_action();
 //BA.debugLineNum = 222;BA.debugLine="MenuDisableItems";
_menudisableitems();
 };
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return "";
}
public static String  _getdatafolder(String _appname) throws Exception{
String _os = "";
String _wf = "";
 //BA.debugLineNum = 933;BA.debugLine="Sub GetDataFolder (AppName As String) As String";
 //BA.debugLineNum = 934;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
 //BA.debugLineNum = 935;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
 //BA.debugLineNum = 936;BA.debugLine="Dim wf As String = File.Combine(GetEnvironmen";
_wf = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.GetEnvironmentVariable("AppData",""),_appname);
 //BA.debugLineNum = 937;BA.debugLine="File.MakeDir(wf, \"\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_wf,"");
 //BA.debugLineNum = 938;BA.debugLine="Return wf";
if (true) return _wf;
 }else {
 //BA.debugLineNum = 940;BA.debugLine="Return File.DirApp";
if (true) return anywheresoftware.b4a.keywords.Common.File.getDirApp();
 };
 //BA.debugLineNum = 942;BA.debugLine="End Sub";
return "";
}
public static String  _loadfile() throws Exception{
anywheresoftware.b4j.objects.FileChooserWrapper _saveopenfile = null;
String _strfilepath = "";
boolean _boolisinlist = false;
int _i = 0;
 //BA.debugLineNum = 269;BA.debugLine="Sub LoadFile";
 //BA.debugLineNum = 270;BA.debugLine="Dim saveopenFile As FileChooser";
_saveopenfile = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 271;BA.debugLine="saveopenFile.Initialize";
_saveopenfile.Initialize();
 //BA.debugLineNum = 272;BA.debugLine="If strExistingFilePath <> \"\" Then";
if ((_strexistingfilepath).equals("") == false) { 
 //BA.debugLineNum = 273;BA.debugLine="saveopenFile.InitialDirectory = strExistingFi";
_saveopenfile.setInitialDirectory(_strexistingfilepath);
 }else {
 //BA.debugLineNum = 275;BA.debugLine="saveopenFile.InitialDirectory = GetDataFolder(st";
_saveopenfile.setInitialDirectory(_getdatafolder(_strappname));
 };
 //BA.debugLineNum = 277;BA.debugLine="Dim strFilePath As String";
_strfilepath = "";
 //BA.debugLineNum = 278;BA.debugLine="strFilePath = saveopenFile.ShowOpen(MainForm)";
_strfilepath = _saveopenfile.ShowOpen(_mainform);
 //BA.debugLineNum = 279;BA.debugLine="MenuDisableItems";
_menudisableitems();
 //BA.debugLineNum = 280;BA.debugLine="If strFilePath <> \"\" Then";
if ((_strfilepath).equals("") == false) { 
 //BA.debugLineNum = 281;BA.debugLine="ChangeStatusBarMessage(\"File Loading ...\")";
_changestatusbarmessage("File Loading ...");
 //BA.debugLineNum = 282;BA.debugLine="strExistingFilePath = File.GetFileParent(strFile";
_strexistingfilepath = anywheresoftware.b4a.keywords.Common.File.GetFileParent(_strfilepath);
 //BA.debugLineNum = 283;BA.debugLine="strExistingFileName = File.GetName(strFilePath)";
_strexistingfilename = anywheresoftware.b4a.keywords.Common.File.GetName(_strfilepath);
 //BA.debugLineNum = 284;BA.debugLine="SaveRecentItems(strExistingFilePath, strExisting";
_saverecentitems(_strexistingfilepath,_strexistingfilename);
 //BA.debugLineNum = 285;BA.debugLine="boolIgnoreComoboBoxSelectedIndexChange = True";
_boolignorecomoboboxselectedindexchange = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 286;BA.debugLine="Dim boolIsInList As Boolean = False";
_boolisinlist = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 287;BA.debugLine="For i = 0 To comboFileField.Items.Size - 1";
{
final int step18 = 1;
final int limit18 = (int) (_combofilefield.getItems().getSize()-1);
for (_i = (int) (0) ; (step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18); _i = ((int)(0 + _i + step18)) ) {
 //BA.debugLineNum = 288;BA.debugLine="If comboFileField.Items.Get(i) = strFilePath Th";
if ((_combofilefield.getItems().Get(_i)).equals((Object)(_strfilepath))) { 
 //BA.debugLineNum = 289;BA.debugLine="boolIsInList = True";
_boolisinlist = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 290;BA.debugLine="comboFileField.SelectedIndex = i";
_combofilefield.setSelectedIndex(_i);
 };
 }
};
 //BA.debugLineNum = 293;BA.debugLine="If boolIsInList = False Then";
if (_boolisinlist==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 294;BA.debugLine="comboFileField.Items.InsertAt(0, strFilePath)";
_combofilefield.getItems().InsertAt((int) (0),(Object)(_strfilepath));
 //BA.debugLineNum = 295;BA.debugLine="comboFileField.SelectedIndex = 0";
_combofilefield.setSelectedIndex((int) (0));
 };
 //BA.debugLineNum = 297;BA.debugLine="boolIgnoreComoboBoxSelectedIndexChange = False";
_boolignorecomoboboxselectedindexchange = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 298;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 299;BA.debugLine="If kvs1.IsInitialized = True Then";
if (_kvs1.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 300;BA.debugLine="kvs1.Close";
_kvs1._close();
 };
 //BA.debugLineNum = 302;BA.debugLine="kvs1.Initialize(strExistingFilePath, strExistin";
_kvs1._initialize(ba,_strexistingfilepath,_strexistingfilename);
 }else {
 //BA.debugLineNum = 304;BA.debugLine="If kvs2.IsInitialized = True Then";
if (_kvs2.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 305;BA.debugLine="kvs2.Close";
_kvs2._close();
 };
 //BA.debugLineNum = 307;BA.debugLine="kvs2.Initialize(strExistingFilePath, strExistin";
_kvs2._initialize(ba,_strexistingfilepath,_strexistingfilename);
 };
 //BA.debugLineNum = 309;BA.debugLine="LoadKVSData";
_loadkvsdata();
 //BA.debugLineNum = 310;BA.debugLine="MenuEnableItems";
_menuenableitems();
 //BA.debugLineNum = 311;BA.debugLine="ChangeStatusBarMessage(\"File loaded: \" & comboFi";
_changestatusbarmessage("File loaded: "+BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 };
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return "";
}
public static String  _loadkvsdata() throws Exception{
anywheresoftware.b4a.objects.collections.List _listkeys = null;
int _i = 0;
Object[] _row = null;
String _strkeyname = "";
String _typeofvalue = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4j.objects.ImageViewWrapper _im = null;
 //BA.debugLineNum = 315;BA.debugLine="Sub LoadKVSData";
 //BA.debugLineNum = 316;BA.debugLine="tableDataView.Items.Clear";
_tabledataview.getItems().Clear();
 //BA.debugLineNum = 317;BA.debugLine="Dim listKeys As List";
_listkeys = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 318;BA.debugLine="listKeys.Initialize";
_listkeys.Initialize();
 //BA.debugLineNum = 319;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 320;BA.debugLine="listKeys = kvs1.ListKeys";
_listkeys = _kvs1._listkeys();
 }else {
 //BA.debugLineNum = 322;BA.debugLine="listKeys = kvs2.ListKeys";
_listkeys = _kvs2._listkeys();
 };
 //BA.debugLineNum = 324;BA.debugLine="For i = 0 To listKeys.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_listkeys.getSize()-1);
for (_i = (int) (0) ; (step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9); _i = ((int)(0 + _i + step9)) ) {
 //BA.debugLineNum = 325;BA.debugLine="Dim Row(2) As Object";
_row = new Object[(int) (2)];
{
int d0 = _row.length;
for (int i0 = 0;i0 < d0;i0++) {
_row[i0] = new Object();
}
}
;
 //BA.debugLineNum = 326;BA.debugLine="Row(0) = listKeys.Get(i)";
_row[(int) (0)] = _listkeys.Get(_i);
 //BA.debugLineNum = 327;BA.debugLine="Dim strKeyName As String = listKeys.Get(i)";
_strkeyname = BA.ObjectToString(_listkeys.Get(_i));
 //BA.debugLineNum = 328;BA.debugLine="strKeyName = strKeyName.ToLowerCase";
_strkeyname = _strkeyname.toLowerCase();
 //BA.debugLineNum = 329;BA.debugLine="Dim typeofvalue As String";
_typeofvalue = "";
 //BA.debugLineNum = 330;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 331;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 332;BA.debugLine="rs = kvs1.sql1.ExecQuery2(\"SELECT typeof(value)";
_rs = _kvs1._sql1.ExecQuery2("SELECT typeof(value) FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.ObjectToString(_listkeys.Get(_i))}));
 }else {
 //BA.debugLineNum = 334;BA.debugLine="rs = kvs2.sql1.ExecQuery2(\"SELECT typeof(value)";
_rs = _kvs2._sql1.ExecQuery2("SELECT typeof(value) FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.ObjectToString(_listkeys.Get(_i))}));
 };
 //BA.debugLineNum = 336;BA.debugLine="typeofvalue = rs.GetString(rs.GetColumnName(0))";
_typeofvalue = _rs.GetString(_rs.GetColumnName((int) (0)));
 //BA.debugLineNum = 337;BA.debugLine="If typeofvalue.ToLowerCase = \"null\" Or typeofval";
if ((_typeofvalue.toLowerCase()).equals("null") || (_typeofvalue.toLowerCase()).equals("blob")) { 
 //BA.debugLineNum = 338;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 339;BA.debugLine="If txtPassword.Text <> \"\" Then";
if ((_txtpassword.getText()).equals("") == false) { 
 //BA.debugLineNum = 340;BA.debugLine="If strKeyName.Contains(\".jpg\") = True Or strK";
if (_strkeyname.contains(".jpg")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".jpeg")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".gif")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".png")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".bmp")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 341;BA.debugLine="Dim im As ImageView";
_im = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 342;BA.debugLine="im.Initialize(\"im\")";
_im.Initialize(ba,"im");
 //BA.debugLineNum = 343;BA.debugLine="im.SetImage(kvs1.GetBitmap(listKeys.Get(i)))";
_im.SetImage((javafx.scene.image.Image)(_kvs1._getbitmap(BA.ObjectToString(_listkeys.Get(_i))).getObject()));
 //BA.debugLineNum = 344;BA.debugLine="Row(1) = im";
_row[(int) (1)] = (Object)(_im.getObject());
 }else {
 //BA.debugLineNum = 346;BA.debugLine="Row(1) = kvs1.GetEncryptedObject(listKeys.Ge";
_row[(int) (1)] = _kvs1._getencryptedobject(BA.ObjectToString(_listkeys.Get(_i)),_txtpassword.getText());
 };
 }else {
 //BA.debugLineNum = 349;BA.debugLine="If strKeyName.Contains(\".jpg\") = True Or strK";
if (_strkeyname.contains(".jpg")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".jpeg")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".gif")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".png")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".bmp")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 350;BA.debugLine="Dim im As ImageView";
_im = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 351;BA.debugLine="im.Initialize(\"im\")";
_im.Initialize(ba,"im");
 //BA.debugLineNum = 352;BA.debugLine="im.SetImage(kvs1.GetBitmap(listKeys.Get(i)))";
_im.SetImage((javafx.scene.image.Image)(_kvs1._getbitmap(BA.ObjectToString(_listkeys.Get(_i))).getObject()));
 //BA.debugLineNum = 353;BA.debugLine="Row(1) = im";
_row[(int) (1)] = (Object)(_im.getObject());
 }else {
 //BA.debugLineNum = 355;BA.debugLine="Row(1) = kvs1.GetObject(listKeys.Get(i))";
_row[(int) (1)] = _kvs1._getobject(BA.ObjectToString(_listkeys.Get(_i)));
 };
 };
 }else {
 //BA.debugLineNum = 359;BA.debugLine="If txtPassword.Text <> \"\" Then";
if ((_txtpassword.getText()).equals("") == false) { 
 //BA.debugLineNum = 360;BA.debugLine="Row(1) = kvs2.GetEncrypted(listKeys.Get(i), t";
_row[(int) (1)] = _kvs2._getencrypted(BA.ObjectToString(_listkeys.Get(_i)),_txtpassword.getText());
 }else {
 //BA.debugLineNum = 362;BA.debugLine="Row(1) = kvs2.Get(listKeys.Get(i))";
_row[(int) (1)] = _kvs2._get(BA.ObjectToString(_listkeys.Get(_i)));
 };
 };
 }else {
 //BA.debugLineNum = 366;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 367;BA.debugLine="If txtPassword.Text <> \"\" Then";
if ((_txtpassword.getText()).equals("") == false) { 
 //BA.debugLineNum = 368;BA.debugLine="Row(1) = kvs1.GetEncryptedObject(listKeys.Get";
_row[(int) (1)] = _kvs1._getencryptedobject(BA.ObjectToString(_listkeys.Get(_i)),_txtpassword.getText());
 }else {
 //BA.debugLineNum = 370;BA.debugLine="Row(1) = kvs1.GetSimple(listKeys.Get(i))";
_row[(int) (1)] = (Object)(_kvs1._getsimple(BA.ObjectToString(_listkeys.Get(_i))));
 };
 }else {
 //BA.debugLineNum = 373;BA.debugLine="If txtPassword.Text <> \"\" Then";
if ((_txtpassword.getText()).equals("") == false) { 
 //BA.debugLineNum = 374;BA.debugLine="Row(1) = kvs2.GetEncrypted(listKeys.Get(i), t";
_row[(int) (1)] = _kvs2._getencrypted(BA.ObjectToString(_listkeys.Get(_i)),_txtpassword.getText());
 }else {
 //BA.debugLineNum = 376;BA.debugLine="Row(1) = kvs2.Get(listKeys.Get(i))";
_row[(int) (1)] = _kvs2._get(BA.ObjectToString(_listkeys.Get(_i)));
 };
 };
 };
 //BA.debugLineNum = 380;BA.debugLine="tableDataView.Items.Add(Row)";
_tabledataview.getItems().Add((Object)(_row));
 }
};
 //BA.debugLineNum = 382;BA.debugLine="refreshTableView";
_refreshtableview();
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub MainForm_Resize (Width As Double, Height As Do";
 //BA.debugLineNum = 94;BA.debugLine="If MainForm.Width < 600.00 Then";
if (_mainform.getWidth()<600.00) { 
 //BA.debugLineNum = 95;BA.debugLine="MainForm.WindowWidth = 600.00";
_mainform.setWindowWidth(600.00);
 };
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public static String  _menuabout_action() throws Exception{
 //BA.debugLineNum = 583;BA.debugLine="Sub menuAbout_Action";
 //BA.debugLineNum = 584;BA.debugLine="dialogue8.InformationDialog(\"About\", \"KVS View";
_dialogue8._informationdialog("About","KVS Viewer V1.02"+anywheresoftware.b4a.keywords.Common.CRLF+"Copyright © 2016, James Melanson","KVS Viewer allows you to view the contents of a KVS data file while developing your application, or during data forensics.");
 //BA.debugLineNum = 586;BA.debugLine="ChangeStatusBarMessage(\"KSV Viewer 1.0, Copyri";
_changestatusbarmessage("KSV Viewer 1.0, Copyright © 2016, Jim Melanson");
 //BA.debugLineNum = 587;BA.debugLine="End Sub";
return "";
}
public static String  _menubackupksvfile_action() throws Exception{
String _strpath = "";
String _strfile = "";
String _strtempfilename = "";
String _strextension = "";
String[] _parts = null;
int _i = 0;
String _strusefilename = "";
 //BA.debugLineNum = 595;BA.debugLine="Sub menuBackupKSVFile_Action";
 //BA.debugLineNum = 596;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 597;BA.debugLine="If comboFileField.Items.Get(comboFileField.Selec";
if ((_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())).equals((Object)("")) == false) { 
 //BA.debugLineNum = 598;BA.debugLine="Dim strPath As String";
_strpath = "";
 //BA.debugLineNum = 599;BA.debugLine="Dim strFile As String";
_strfile = "";
 //BA.debugLineNum = 600;BA.debugLine="strPath = File.GetFileParent(comboFileField.Ite";
_strpath = anywheresoftware.b4a.keywords.Common.File.GetFileParent(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 601;BA.debugLine="strFile = File.GetName(comboFileField.Items.Get";
_strfile = anywheresoftware.b4a.keywords.Common.File.GetName(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 602;BA.debugLine="If File.IsDirectory(strPath, strFile) = True Th";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_strpath,_strfile)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 603;BA.debugLine="dialogue8.WarningDialog(\"File Selection Error\"";
_dialogue8._warningdialog("File Selection Error","No File Selected","You must select a file to import.");
 }else {
 //BA.debugLineNum = 605;BA.debugLine="Dim strTempFileName As String = strFile";
_strtempfilename = _strfile;
 //BA.debugLineNum = 606;BA.debugLine="Dim strExtension As String";
_strextension = "";
 //BA.debugLineNum = 607;BA.debugLine="If strFile.IndexOf(\".\") > 0 Then";
if (_strfile.indexOf(".")>0) { 
 //BA.debugLineNum = 608;BA.debugLine="Dim parts() As String = Regex.Split(\"\\.\", str";
_parts = anywheresoftware.b4a.keywords.Common.Regex.Split("\\.",_strfile);
 //BA.debugLineNum = 609;BA.debugLine="strExtension = parts(parts.Length - 1)";
_strextension = _parts[(int) (_parts.length-1)];
 //BA.debugLineNum = 610;BA.debugLine="If parts.Length > 2 Then";
if (_parts.length>2) { 
 //BA.debugLineNum = 611;BA.debugLine="For i = 0 To parts.Length - 2";
{
final int step16 = 1;
final int limit16 = (int) (_parts.length-2);
for (_i = (int) (0) ; (step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16); _i = ((int)(0 + _i + step16)) ) {
 //BA.debugLineNum = 612;BA.debugLine="strTempFileName = strTempFileName & parts(i";
_strtempfilename = _strtempfilename+_parts[_i];
 }
};
 }else {
 //BA.debugLineNum = 615;BA.debugLine="strTempFileName = parts(0)";
_strtempfilename = _parts[(int) (0)];
 };
 };
 //BA.debugLineNum = 618;BA.debugLine="Dim strUseFileName As String";
_strusefilename = "";
 //BA.debugLineNum = 619;BA.debugLine="For i = 1 To 10000";
{
final int step24 = 1;
final int limit24 = (int) (10000);
for (_i = (int) (1) ; (step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24); _i = ((int)(0 + _i + step24)) ) {
 //BA.debugLineNum = 620;BA.debugLine="If strExtension <> \"\" Then";
if ((_strextension).equals("") == false) { 
 //BA.debugLineNum = 621;BA.debugLine="If File.Exists(strPath, strTempFileName & \"_";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_strpath,_strtempfilename+"_backup_"+BA.NumberToString(_i)+"."+_strextension)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 622;BA.debugLine="strUseFileName = strTempFileName & \"_backup";
_strusefilename = _strtempfilename+"_backup_"+BA.NumberToString(_i)+"."+_strextension;
 //BA.debugLineNum = 623;BA.debugLine="Exit";
if (true) break;
 };
 }else {
 //BA.debugLineNum = 626;BA.debugLine="If File.Exists(strPath, strTempFileName & \"_";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_strpath,_strtempfilename+"_backup_"+BA.NumberToString(_i))==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 627;BA.debugLine="strUseFileName = strTempFileName & \"_backup";
_strusefilename = _strtempfilename+"_backup_"+BA.NumberToString(_i);
 //BA.debugLineNum = 628;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 //BA.debugLineNum = 632;BA.debugLine="If strUseFileName <> \"\" Then";
if ((_strusefilename).equals("") == false) { 
 //BA.debugLineNum = 633;BA.debugLine="File.Copy(strPath, strFile, strPath, strUseFi";
anywheresoftware.b4a.keywords.Common.File.Copy(_strpath,_strfile,_strpath,_strusefilename);
 //BA.debugLineNum = 634;BA.debugLine="ChangeStatusBarMessage(\"Backup file creadt";
_changestatusbarmessage("Backup file creadted: "+anywheresoftware.b4a.keywords.Common.File.Combine(_strpath,_strusefilename));
 }else {
 //BA.debugLineNum = 636;BA.debugLine="dialogue8.WarningDialog(\"KSV File Backup\", \"B";
_dialogue8._warningdialog("KSV File Backup","Backup Error","The application could not create a backup file. Please do so manually.");
 //BA.debugLineNum = 637;BA.debugLine="ChangeStatusBarMessage(\"Backu process failed.";
_changestatusbarmessage("Backu process failed. There are too many backup copies. Please backup the file manually, or remove some of your previous backups.");
 };
 };
 };
 };
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return "";
}
public static String  _menucleardata_action() throws Exception{
 //BA.debugLineNum = 562;BA.debugLine="Sub menuClearData_Action";
 //BA.debugLineNum = 563;BA.debugLine="tableDataView.Items.Clear";
_tabledataview.getItems().Clear();
 //BA.debugLineNum = 565;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 566;BA.debugLine="If kvs1.IsInitialized = True Then";
if (_kvs1.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 567;BA.debugLine="kvs1.Close";
_kvs1._close();
 };
 }else {
 //BA.debugLineNum = 570;BA.debugLine="If kvs2.IsInitialized = True Then";
if (_kvs2.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 571;BA.debugLine="kvs2.Close";
_kvs2._close();
 };
 };
 //BA.debugLineNum = 574;BA.debugLine="ChangeStatusBarMessage(\"Contents cleared.\")";
_changestatusbarmessage("Contents cleared.");
 //BA.debugLineNum = 575;BA.debugLine="MenuDisableItems";
_menudisableitems();
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return "";
}
public static String  _menuclearrecentitems_action() throws Exception{
 //BA.debugLineNum = 578;BA.debugLine="Sub menuClearRecentItems_Action";
 //BA.debugLineNum = 579;BA.debugLine="ClearRecentItemsList";
_clearrecentitemslist();
 //BA.debugLineNum = 580;BA.debugLine="ChangeStatusBarMessage(\"The recent items list has";
_changestatusbarmessage("The recent items list has been deleted.");
 //BA.debugLineNum = 581;BA.debugLine="End Sub";
return "";
}
public static String  _menucopytablecell_action() throws Exception{
String _strcellcontent = "";
 //BA.debugLineNum = 501;BA.debugLine="Sub menuCopyTableCell_Action";
 //BA.debugLineNum = 502;BA.debugLine="If tableDataView.SelectedRow >= 0 Then";
if (_tabledataview.getSelectedRow()>=0) { 
 //BA.debugLineNum = 503;BA.debugLine="Dim strCellContent As String = tableviewCell";
_strcellcontent = BA.ObjectToString(_tableviewcell);
 //BA.debugLineNum = 504;BA.debugLine="fx.Clipboard.SetString(strCellContent)";
_fx.Clipboard.SetString(_strcellcontent);
 //BA.debugLineNum = 505;BA.debugLine="ChangeStatusBarMessage(\"Cell contents copied to";
_changestatusbarmessage("Cell contents copied to clipboard.");
 };
 //BA.debugLineNum = 507;BA.debugLine="End Sub";
return "";
}
public static String  _menudisableitems() throws Exception{
anywheresoftware.b4a.objects.collections.List _listenable = null;
int _i = 0;
int _i2 = 0;
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
anywheresoftware.b4a.objects.collections.List _listcontextenable = null;
 //BA.debugLineNum = 421;BA.debugLine="Sub MenuDisableItems";
 //BA.debugLineNum = 422;BA.debugLine="Dim listEnable As List";
_listenable = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 423;BA.debugLine="listEnable.Initialize";
_listenable.Initialize();
 //BA.debugLineNum = 424;BA.debugLine="listEnable.Add(\"mnuSynch\")";
_listenable.Add((Object)("mnuSynch"));
 //BA.debugLineNum = 425;BA.debugLine="listEnable.Add(\"mnuClear\")";
_listenable.Add((Object)("mnuClear"));
 //BA.debugLineNum = 426;BA.debugLine="listEnable.Add(\"mnuBackup\")";
_listenable.Add((Object)("mnuBackup"));
 //BA.debugLineNum = 427;BA.debugLine="listEnable.Add(\"mnuExport\")";
_listenable.Add((Object)("mnuExport"));
 //BA.debugLineNum = 428;BA.debugLine="listEnable.Add(\"mnuTableCopy\")";
_listenable.Add((Object)("mnuTableCopy"));
 //BA.debugLineNum = 429;BA.debugLine="listEnable.Add(\"mnuTableHide\")";
_listenable.Add((Object)("mnuTableHide"));
 //BA.debugLineNum = 430;BA.debugLine="listEnable.Add(\"mnuTableEdit\")";
_listenable.Add((Object)("mnuTableEdit"));
 //BA.debugLineNum = 431;BA.debugLine="listEnable.Add(\"menuKVSDeleteRecord\")";
_listenable.Add((Object)("menuKVSDeleteRecord"));
 //BA.debugLineNum = 432;BA.debugLine="For i = 0 To mapMenus.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_mapmenus.getSize()-1);
for (_i = (int) (0) ; (step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11); _i = ((int)(0 + _i + step11)) ) {
 //BA.debugLineNum = 433;BA.debugLine="For i2 = 0 To listEnable.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_listenable.getSize()-1);
for (_i2 = (int) (0) ; (step12 > 0 && _i2 <= limit12) || (step12 < 0 && _i2 >= limit12); _i2 = ((int)(0 + _i2 + step12)) ) {
 //BA.debugLineNum = 434;BA.debugLine="If mapMenus.GetKeyAt(i) = listEnable.Get(i2) Th";
if ((_mapmenus.GetKeyAt(_i)).equals(_listenable.Get(_i2))) { 
 //BA.debugLineNum = 435;BA.debugLine="Dim mi As MenuItem = mapMenus.Get(listEnable.G";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapmenus.Get(_listenable.Get(_i2))));
 //BA.debugLineNum = 436;BA.debugLine="mi.Enabled = False";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 437;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 //BA.debugLineNum = 441;BA.debugLine="Dim listContextEnable As List";
_listcontextenable = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 442;BA.debugLine="listContextEnable.Initialize";
_listcontextenable.Initialize();
 //BA.debugLineNum = 443;BA.debugLine="listContextEnable.Add(\"mnuTableCopy\")";
_listcontextenable.Add((Object)("mnuTableCopy"));
 //BA.debugLineNum = 444;BA.debugLine="listContextEnable.Add(\"mnuTableHide\")";
_listcontextenable.Add((Object)("mnuTableHide"));
 //BA.debugLineNum = 445;BA.debugLine="listContextEnable.Add(\"mnuTableEdit\")";
_listcontextenable.Add((Object)("mnuTableEdit"));
 //BA.debugLineNum = 446;BA.debugLine="listContextEnable.Add(\"mnuTableDelete\")";
_listcontextenable.Add((Object)("mnuTableDelete"));
 //BA.debugLineNum = 447;BA.debugLine="For i = 0 To mapContextMenus.Size - 1";
{
final int step26 = 1;
final int limit26 = (int) (_mapcontextmenus.getSize()-1);
for (_i = (int) (0) ; (step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26); _i = ((int)(0 + _i + step26)) ) {
 //BA.debugLineNum = 448;BA.debugLine="For i2 = 0 To listContextEnable.Size - 1";
{
final int step27 = 1;
final int limit27 = (int) (_listcontextenable.getSize()-1);
for (_i2 = (int) (0) ; (step27 > 0 && _i2 <= limit27) || (step27 < 0 && _i2 >= limit27); _i2 = ((int)(0 + _i2 + step27)) ) {
 //BA.debugLineNum = 449;BA.debugLine="If mapContextMenus.GetKeyAt(i) = listContextEna";
if ((_mapcontextmenus.GetKeyAt(_i)).equals(_listcontextenable.Get(_i2))) { 
 //BA.debugLineNum = 450;BA.debugLine="Dim mi As MenuItem = mapContextMenus.Get(listC";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapcontextmenus.Get(_listcontextenable.Get(_i2))));
 //BA.debugLineNum = 451;BA.debugLine="mi.Enabled = False";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 452;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 //BA.debugLineNum = 456;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return "";
}
public static String  _menueditrecord_action() throws Exception{
Object[] _row = null;
 //BA.debugLineNum = 546;BA.debugLine="Sub menuEditRecord_Action";
 //BA.debugLineNum = 547;BA.debugLine="If tableDataView.SelectedRow >= 0 Then";
if (_tabledataview.getSelectedRow()>=0) { 
 //BA.debugLineNum = 548;BA.debugLine="Dim Row() As Object = tableDataView.Items.Get(ta";
_row = (Object[])(_tabledataview.getItems().Get(_tabledataview.getSelectedRow()));
 //BA.debugLineNum = 549;BA.debugLine="txtAddEditKeyname.Text = Row(0)";
_txtaddeditkeyname.setText(BA.ObjectToString(_row[(int) (0)]));
 //BA.debugLineNum = 550;BA.debugLine="txtAddEditValue.Text = Row(1)";
_txtaddeditvalue.setText(BA.ObjectToString(_row[(int) (1)]));
 };
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return "";
}
public static String  _menuenableitems() throws Exception{
anywheresoftware.b4a.objects.collections.List _listenable = null;
int _i = 0;
int _i2 = 0;
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
anywheresoftware.b4a.objects.collections.List _listcontextenable = null;
 //BA.debugLineNum = 459;BA.debugLine="Sub MenuEnableItems";
 //BA.debugLineNum = 460;BA.debugLine="Dim listEnable As List";
_listenable = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 461;BA.debugLine="listEnable.Initialize";
_listenable.Initialize();
 //BA.debugLineNum = 462;BA.debugLine="listEnable.Add(\"mnuSynch\")";
_listenable.Add((Object)("mnuSynch"));
 //BA.debugLineNum = 463;BA.debugLine="listEnable.Add(\"mnuClear\")";
_listenable.Add((Object)("mnuClear"));
 //BA.debugLineNum = 464;BA.debugLine="listEnable.Add(\"mnuBackup\")";
_listenable.Add((Object)("mnuBackup"));
 //BA.debugLineNum = 465;BA.debugLine="listEnable.Add(\"mnuExport\")";
_listenable.Add((Object)("mnuExport"));
 //BA.debugLineNum = 466;BA.debugLine="listEnable.Add(\"mnuTableCopy\")";
_listenable.Add((Object)("mnuTableCopy"));
 //BA.debugLineNum = 467;BA.debugLine="listEnable.Add(\"mnuTableHide\")";
_listenable.Add((Object)("mnuTableHide"));
 //BA.debugLineNum = 468;BA.debugLine="listEnable.Add(\"mnuTableEdit\")";
_listenable.Add((Object)("mnuTableEdit"));
 //BA.debugLineNum = 469;BA.debugLine="listEnable.Add(\"menuKVSDeleteRecord\")";
_listenable.Add((Object)("menuKVSDeleteRecord"));
 //BA.debugLineNum = 470;BA.debugLine="For i = 0 To mapMenus.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_mapmenus.getSize()-1);
for (_i = (int) (0) ; (step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11); _i = ((int)(0 + _i + step11)) ) {
 //BA.debugLineNum = 471;BA.debugLine="For i2 = 0 To listEnable.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_listenable.getSize()-1);
for (_i2 = (int) (0) ; (step12 > 0 && _i2 <= limit12) || (step12 < 0 && _i2 >= limit12); _i2 = ((int)(0 + _i2 + step12)) ) {
 //BA.debugLineNum = 472;BA.debugLine="If mapMenus.GetKeyAt(i) = listEnable.Get(i2) Th";
if ((_mapmenus.GetKeyAt(_i)).equals(_listenable.Get(_i2))) { 
 //BA.debugLineNum = 473;BA.debugLine="Dim mi As MenuItem = mapMenus.Get(listEnable.G";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapmenus.Get(_listenable.Get(_i2))));
 //BA.debugLineNum = 474;BA.debugLine="mi.Enabled = True";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 475;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 //BA.debugLineNum = 479;BA.debugLine="Dim listContextEnable As List";
_listcontextenable = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 480;BA.debugLine="listContextEnable.Initialize";
_listcontextenable.Initialize();
 //BA.debugLineNum = 481;BA.debugLine="listContextEnable.Add(\"mnuTableCopy\")";
_listcontextenable.Add((Object)("mnuTableCopy"));
 //BA.debugLineNum = 482;BA.debugLine="listContextEnable.Add(\"mnuTableHide\")";
_listcontextenable.Add((Object)("mnuTableHide"));
 //BA.debugLineNum = 483;BA.debugLine="listContextEnable.Add(\"mnuTableEdit\")";
_listcontextenable.Add((Object)("mnuTableEdit"));
 //BA.debugLineNum = 484;BA.debugLine="listContextEnable.Add(\"mnuTableDelete\")";
_listcontextenable.Add((Object)("mnuTableDelete"));
 //BA.debugLineNum = 485;BA.debugLine="For i = 0 To mapContextMenus.Size - 1";
{
final int step26 = 1;
final int limit26 = (int) (_mapcontextmenus.getSize()-1);
for (_i = (int) (0) ; (step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26); _i = ((int)(0 + _i + step26)) ) {
 //BA.debugLineNum = 486;BA.debugLine="For i2 = 0 To listContextEnable.Size - 1";
{
final int step27 = 1;
final int limit27 = (int) (_listcontextenable.getSize()-1);
for (_i2 = (int) (0) ; (step27 > 0 && _i2 <= limit27) || (step27 < 0 && _i2 >= limit27); _i2 = ((int)(0 + _i2 + step27)) ) {
 //BA.debugLineNum = 487;BA.debugLine="If mapContextMenus.GetKeyAt(i) = listContextEna";
if ((_mapcontextmenus.GetKeyAt(_i)).equals(_listcontextenable.Get(_i2))) { 
 //BA.debugLineNum = 488;BA.debugLine="Dim mi As MenuItem = mapContextMenus.Get(listC";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapcontextmenus.Get(_listcontextenable.Get(_i2))));
 //BA.debugLineNum = 489;BA.debugLine="mi.Enabled = True";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 490;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 //BA.debugLineNum = 494;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return "";
}
public static String  _menuexit_action() throws Exception{
 //BA.debugLineNum = 558;BA.debugLine="Sub menuExit_Action";
 //BA.debugLineNum = 559;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 560;BA.debugLine="End Sub";
return "";
}
public static String  _menuexporttocsv_action() throws Exception{
anywheresoftware.b4a.objects.collections.List _listwrite = null;
boolean _boolisdata = false;
String _strrecord = "";
int _i = 0;
Object[] _row = null;
String _strthiskey = "";
String _strthisvalue = "";
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _strsaveas = "";
anywheresoftware.b4j.object.JavaObject _fileo = null;
String _filename = "";
String _filepath = "";
 //BA.debugLineNum = 644;BA.debugLine="Sub menuExportToCSV_Action";
 //BA.debugLineNum = 645;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 646;BA.debugLine="If tableDataView.Items.Size > 0 Then";
if (_tabledataview.getItems().getSize()>0) { 
 //BA.debugLineNum = 647;BA.debugLine="Dim listWrite As List";
_listwrite = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 648;BA.debugLine="listWrite.Initialize";
_listwrite.Initialize();
 //BA.debugLineNum = 649;BA.debugLine="Dim boolIsData As Boolean = False";
_boolisdata = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 650;BA.debugLine="Dim strRecord As String";
_strrecord = "";
 //BA.debugLineNum = 651;BA.debugLine="strRecord = QUOTE & \"Key Name\" & QUOTE & \",\" &";
_strrecord = anywheresoftware.b4a.keywords.Common.QUOTE+"Key Name"+anywheresoftware.b4a.keywords.Common.QUOTE+","+anywheresoftware.b4a.keywords.Common.QUOTE+"Value"+anywheresoftware.b4a.keywords.Common.QUOTE;
 //BA.debugLineNum = 652;BA.debugLine="listWrite.Add(strRecord)";
_listwrite.Add((Object)(_strrecord));
 //BA.debugLineNum = 653;BA.debugLine="For i = 0 To tableDataView.Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_tabledataview.getItems().getSize()-1);
for (_i = (int) (0) ; (step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9); _i = ((int)(0 + _i + step9)) ) {
 //BA.debugLineNum = 654;BA.debugLine="Dim Row() As Object = tableDataView.Items.Get(";
_row = (Object[])(_tabledataview.getItems().Get(_i));
 //BA.debugLineNum = 655;BA.debugLine="Dim strThisKey As String = Row(0)";
_strthiskey = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 656;BA.debugLine="strThisKey.Replace(QUOTE, QUOTE & QUOTE)";
_strthiskey.replace(anywheresoftware.b4a.keywords.Common.QUOTE,anywheresoftware.b4a.keywords.Common.QUOTE+anywheresoftware.b4a.keywords.Common.QUOTE);
 //BA.debugLineNum = 657;BA.debugLine="Dim strThisValue As String = Row(1)";
_strthisvalue = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 658;BA.debugLine="strThisValue.Replace(QUOTE, QUOTE & QUOTE)";
_strthisvalue.replace(anywheresoftware.b4a.keywords.Common.QUOTE,anywheresoftware.b4a.keywords.Common.QUOTE+anywheresoftware.b4a.keywords.Common.QUOTE);
 //BA.debugLineNum = 659;BA.debugLine="strRecord = QUOTE & strThisKey & QUOTE & \",\" &";
_strrecord = anywheresoftware.b4a.keywords.Common.QUOTE+_strthiskey+anywheresoftware.b4a.keywords.Common.QUOTE+","+anywheresoftware.b4a.keywords.Common.QUOTE+_strthisvalue+anywheresoftware.b4a.keywords.Common.QUOTE;
 //BA.debugLineNum = 660;BA.debugLine="listWrite.Add(strRecord)";
_listwrite.Add((Object)(_strrecord));
 //BA.debugLineNum = 661;BA.debugLine="boolIsData = True";
_boolisdata = anywheresoftware.b4a.keywords.Common.True;
 }
};
 //BA.debugLineNum = 663;BA.debugLine="If boolIsData = True Then";
if (_boolisdata==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 664;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 665;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 666;BA.debugLine="If strExistingFilePath.Length > 0 Then";
if (_strexistingfilepath.length()>0) { 
 //BA.debugLineNum = 667;BA.debugLine="fc.InitialDirectory = strExistingFilePath";
_fc.setInitialDirectory(_strexistingfilepath);
 }else {
 //BA.debugLineNum = 669;BA.debugLine="fc.InitialDirectory = GetDataFolder(strAppNam";
_fc.setInitialDirectory(_getdatafolder(_strappname));
 };
 //BA.debugLineNum = 671;BA.debugLine="fc.InitialFileName = SuggestProfileNameForPrin";
_fc.setInitialFileName(_suggestprofilenameforprintsaveexport("csv"));
 //BA.debugLineNum = 672;BA.debugLine="fc.Title = \"Save CSV File\"";
_fc.setTitle("Save CSV File");
 //BA.debugLineNum = 673;BA.debugLine="Dim strSaveAs As String";
_strsaveas = "";
 //BA.debugLineNum = 674;BA.debugLine="strSaveAs = fc.Showsave(MainForm)";
_strsaveas = _fc.ShowSave(_mainform);
 //BA.debugLineNum = 676;BA.debugLine="If strSaveAs.Length = 0 Then Return";
if (_strsaveas.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 677;BA.debugLine="Dim fileO As JavaObject";
_fileo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 678;BA.debugLine="fileO.InitializeNewInstance(\"java.io.File\",";
_fileo.InitializeNewInstance("java.io.File",new Object[]{(Object)(_strsaveas)});
 //BA.debugLineNum = 679;BA.debugLine="Dim fileName As String";
_filename = "";
 //BA.debugLineNum = 680;BA.debugLine="Dim filePath As String";
_filepath = "";
 //BA.debugLineNum = 681;BA.debugLine="fileName = fileO.RunMethod(\"getName\", Null)";
_filename = BA.ObjectToString(_fileo.RunMethod("getName",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 682;BA.debugLine="filePath = fileO.RunMethod(\"getPath\", Null)";
_filepath = BA.ObjectToString(_fileo.RunMethod("getPath",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 683;BA.debugLine="filePath = filePath.Replace(fileName, \"\")";
_filepath = _filepath.replace(_filename,"");
 //BA.debugLineNum = 684;BA.debugLine="strExistingFilePath = filePath";
_strexistingfilepath = _filepath;
 //BA.debugLineNum = 685;BA.debugLine="File.WriteList(filePath, fileName, listWrite)";
anywheresoftware.b4a.keywords.Common.File.WriteList(_filepath,_filename,_listwrite);
 //BA.debugLineNum = 686;BA.debugLine="fx.ShowExternalDocument(File.GetUri(filePath,";
_fx.ShowExternalDocument(anywheresoftware.b4a.keywords.Common.File.GetUri(_filepath,_filename));
 //BA.debugLineNum = 687;BA.debugLine="ChangeStatusBarMessage(\"The displayed contents";
_changestatusbarmessage("The displayed contents have been exported as a CSV file: "+anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 };
 };
 };
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return "";
}
public static String  _menuexporttojson_action() throws Exception{
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
boolean _boolisdata = false;
int _i = 0;
Object[] _row = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
anywheresoftware.b4a.objects.collections.List _data = null;
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _strsaveas = "";
anywheresoftware.b4j.object.JavaObject _fileo = null;
String _filename = "";
String _filepath = "";
 //BA.debugLineNum = 778;BA.debugLine="Sub menuExportToJSON_Action";
 //BA.debugLineNum = 779;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 780;BA.debugLine="If tableDataView.Items.Size > 0 Then";
if (_tabledataview.getItems().getSize()>0) { 
 //BA.debugLineNum = 781;BA.debugLine="Dim mapJson As Map";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 782;BA.debugLine="mapJson.Initialize";
_mapjson.Initialize();
 //BA.debugLineNum = 783;BA.debugLine="Dim boolIsData As Boolean = False";
_boolisdata = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 784;BA.debugLine="For i = 0 To tableDataView.Items.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_tabledataview.getItems().getSize()-1);
for (_i = (int) (0) ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
 //BA.debugLineNum = 785;BA.debugLine="Dim Row() As Object = tableDataView.Items.Get(";
_row = (Object[])(_tabledataview.getItems().Get(_i));
 //BA.debugLineNum = 786;BA.debugLine="mapJson.Put(Row(0), Row(1))";
_mapjson.Put(_row[(int) (0)],_row[(int) (1)]);
 //BA.debugLineNum = 787;BA.debugLine="boolIsData = True";
_boolisdata = anywheresoftware.b4a.keywords.Common.True;
 }
};
 //BA.debugLineNum = 789;BA.debugLine="If boolIsData = True Then";
if (_boolisdata==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 790;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 791;BA.debugLine="Dim Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 792;BA.debugLine="Data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 793;BA.debugLine="Data.Add(mapJson)";
_data.Add((Object)(_mapjson.getObject()));
 //BA.debugLineNum = 794;BA.debugLine="JSONGenerator.Initialize2(Data)";
_jsongenerator.Initialize2(_data);
 //BA.debugLineNum = 795;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 796;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 797;BA.debugLine="If strExistingFilePath.Length > 0 Then";
if (_strexistingfilepath.length()>0) { 
 //BA.debugLineNum = 798;BA.debugLine="fc.InitialDirectory = strExistingFilePath";
_fc.setInitialDirectory(_strexistingfilepath);
 }else {
 //BA.debugLineNum = 800;BA.debugLine="fc.InitialDirectory = GetDataFolder(strAppNam";
_fc.setInitialDirectory(_getdatafolder(_strappname));
 };
 //BA.debugLineNum = 802;BA.debugLine="fc.InitialFileName = SuggestProfileNameForPrin";
_fc.setInitialFileName(_suggestprofilenameforprintsaveexport("json"));
 //BA.debugLineNum = 803;BA.debugLine="fc.Title = \"Save CSV File\"";
_fc.setTitle("Save CSV File");
 //BA.debugLineNum = 804;BA.debugLine="Dim strSaveAs As String";
_strsaveas = "";
 //BA.debugLineNum = 805;BA.debugLine="strSaveAs = fc.Showsave(MainForm)";
_strsaveas = _fc.ShowSave(_mainform);
 //BA.debugLineNum = 807;BA.debugLine="If strSaveAs.Length = 0 Then Return";
if (_strsaveas.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 808;BA.debugLine="Dim fileO As JavaObject";
_fileo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 809;BA.debugLine="fileO.InitializeNewInstance(\"java.io.File\",";
_fileo.InitializeNewInstance("java.io.File",new Object[]{(Object)(_strsaveas)});
 //BA.debugLineNum = 810;BA.debugLine="Dim fileName As String";
_filename = "";
 //BA.debugLineNum = 811;BA.debugLine="Dim filePath As String";
_filepath = "";
 //BA.debugLineNum = 812;BA.debugLine="fileName = fileO.RunMethod(\"getName\", Null)";
_filename = BA.ObjectToString(_fileo.RunMethod("getName",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 813;BA.debugLine="filePath = fileO.RunMethod(\"getPath\", Null)";
_filepath = BA.ObjectToString(_fileo.RunMethod("getPath",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 814;BA.debugLine="filePath = filePath.Replace(fileName, \"\")";
_filepath = _filepath.replace(_filename,"");
 //BA.debugLineNum = 815;BA.debugLine="strExistingFilePath = filePath";
_strexistingfilepath = _filepath;
 //BA.debugLineNum = 816;BA.debugLine="File.WriteString(filePath, fileName, JSONGener";
anywheresoftware.b4a.keywords.Common.File.WriteString(_filepath,_filename,_jsongenerator.ToPrettyString((int) (2)));
 //BA.debugLineNum = 817;BA.debugLine="dialogue8.InformationDialog(\"Export Confirmati";
_dialogue8._informationdialog("Export Confirmation","JSON File Created","You will find the file here:"+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 //BA.debugLineNum = 818;BA.debugLine="ChangeStatusBarMessage(\"The displayed contents";
_changestatusbarmessage("The displayed contents have been exported as a JSON file: "+anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 };
 };
 };
 //BA.debugLineNum = 822;BA.debugLine="End Sub";
return "";
}
public static String  _menuexporttotext_action() throws Exception{
anywheresoftware.b4a.objects.collections.List _listwrite = null;
boolean _boolisdata = false;
String _strrecord = "";
int _i = 0;
Object[] _row = null;
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _strsaveas = "";
anywheresoftware.b4j.object.JavaObject _fileo = null;
String _filename = "";
String _filepath = "";
 //BA.debugLineNum = 693;BA.debugLine="Sub menuExportToText_Action";
 //BA.debugLineNum = 694;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 695;BA.debugLine="If tableDataView.Items.Size > 0 Then";
if (_tabledataview.getItems().getSize()>0) { 
 //BA.debugLineNum = 696;BA.debugLine="Dim listWrite As List";
_listwrite = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 697;BA.debugLine="listWrite.Initialize";
_listwrite.Initialize();
 //BA.debugLineNum = 698;BA.debugLine="Dim boolIsData As Boolean = False";
_boolisdata = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 699;BA.debugLine="Dim strRecord As String";
_strrecord = "";
 //BA.debugLineNum = 700;BA.debugLine="For i = 0 To tableDataView.Items.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_tabledataview.getItems().getSize()-1);
for (_i = (int) (0) ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
 //BA.debugLineNum = 701;BA.debugLine="Dim Row() As Object = tableDataView.Items.Get(";
_row = (Object[])(_tabledataview.getItems().Get(_i));
 //BA.debugLineNum = 702;BA.debugLine="strRecord = Row(0) & TAB & \"=>\" & TAB & Row(1)";
_strrecord = BA.ObjectToString(_row[(int) (0)])+anywheresoftware.b4a.keywords.Common.TAB+"=>"+anywheresoftware.b4a.keywords.Common.TAB+BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 703;BA.debugLine="listWrite.Add(strRecord)";
_listwrite.Add((Object)(_strrecord));
 //BA.debugLineNum = 704;BA.debugLine="boolIsData = True";
_boolisdata = anywheresoftware.b4a.keywords.Common.True;
 }
};
 //BA.debugLineNum = 706;BA.debugLine="If boolIsData = True Then";
if (_boolisdata==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 707;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 708;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 709;BA.debugLine="If strExistingFilePath.Length > 0 Then";
if (_strexistingfilepath.length()>0) { 
 //BA.debugLineNum = 710;BA.debugLine="fc.InitialDirectory = strExistingFilePath";
_fc.setInitialDirectory(_strexistingfilepath);
 }else {
 //BA.debugLineNum = 712;BA.debugLine="fc.InitialDirectory = GetDataFolder(strAppNam";
_fc.setInitialDirectory(_getdatafolder(_strappname));
 };
 //BA.debugLineNum = 714;BA.debugLine="fc.InitialFileName = SuggestProfileNameForPrin";
_fc.setInitialFileName(_suggestprofilenameforprintsaveexport("txt"));
 //BA.debugLineNum = 715;BA.debugLine="fc.Title = \"Save CSV File\"";
_fc.setTitle("Save CSV File");
 //BA.debugLineNum = 716;BA.debugLine="Dim strSaveAs As String";
_strsaveas = "";
 //BA.debugLineNum = 717;BA.debugLine="strSaveAs = fc.Showsave(MainForm)";
_strsaveas = _fc.ShowSave(_mainform);
 //BA.debugLineNum = 719;BA.debugLine="If strSaveAs.Length = 0 Then Return";
if (_strsaveas.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 720;BA.debugLine="Dim fileO As JavaObject";
_fileo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 721;BA.debugLine="fileO.InitializeNewInstance(\"java.io.File\",";
_fileo.InitializeNewInstance("java.io.File",new Object[]{(Object)(_strsaveas)});
 //BA.debugLineNum = 722;BA.debugLine="Dim fileName As String";
_filename = "";
 //BA.debugLineNum = 723;BA.debugLine="Dim filePath As String";
_filepath = "";
 //BA.debugLineNum = 724;BA.debugLine="fileName = fileO.RunMethod(\"getName\", Null)";
_filename = BA.ObjectToString(_fileo.RunMethod("getName",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 725;BA.debugLine="filePath = fileO.RunMethod(\"getPath\", Null)";
_filepath = BA.ObjectToString(_fileo.RunMethod("getPath",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 726;BA.debugLine="filePath = filePath.Replace(fileName, \"\")";
_filepath = _filepath.replace(_filename,"");
 //BA.debugLineNum = 727;BA.debugLine="strExistingFilePath = filePath";
_strexistingfilepath = _filepath;
 //BA.debugLineNum = 728;BA.debugLine="File.WriteList(filePath, fileName, listWrite)";
anywheresoftware.b4a.keywords.Common.File.WriteList(_filepath,_filename,_listwrite);
 //BA.debugLineNum = 729;BA.debugLine="fx.ShowExternalDocument(File.GetUri(filePath,";
_fx.ShowExternalDocument(anywheresoftware.b4a.keywords.Common.File.GetUri(_filepath,_filename));
 //BA.debugLineNum = 730;BA.debugLine="ChangeStatusBarMessage(\"The displayed contents";
_changestatusbarmessage("The displayed contents have been exported as a TEXT file: "+anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 };
 };
 };
 //BA.debugLineNum = 734;BA.debugLine="End Sub";
return "";
}
public static String  _menuexporttoxml_action() throws Exception{
boolean _boolisdata = false;
String _strxmlcontent = "";
int _i = 0;
Object[] _row = null;
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _strsaveas = "";
anywheresoftware.b4j.object.JavaObject _fileo = null;
String _filename = "";
String _filepath = "";
 //BA.debugLineNum = 736;BA.debugLine="Sub menuExportToXML_Action";
 //BA.debugLineNum = 737;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 738;BA.debugLine="If tableDataView.Items.Size > 0 Then";
if (_tabledataview.getItems().getSize()>0) { 
 //BA.debugLineNum = 739;BA.debugLine="Dim boolIsData As Boolean";
_boolisdata = false;
 //BA.debugLineNum = 740;BA.debugLine="Dim strXMLContent As String";
_strxmlcontent = "";
 //BA.debugLineNum = 741;BA.debugLine="strXMLContent = \"<?xml version=\" & QUOTE & \"1.0";
_strxmlcontent = "<?xml version="+anywheresoftware.b4a.keywords.Common.QUOTE+"1.0"+anywheresoftware.b4a.keywords.Common.QUOTE+"?>"+anywheresoftware.b4a.keywords.Common.CRLF+"<kvs url="+anywheresoftware.b4a.keywords.Common.QUOTE+BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex()))+anywheresoftware.b4a.keywords.Common.QUOTE+" modified="+anywheresoftware.b4a.keywords.Common.QUOTE+anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.File.LastModified(anywheresoftware.b4a.keywords.Common.File.GetFileParent(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex()))),anywheresoftware.b4a.keywords.Common.File.GetName(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())))))+anywheresoftware.b4a.keywords.Common.QUOTE+" xmlgenerated="+anywheresoftware.b4a.keywords.Common.QUOTE+anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow())+anywheresoftware.b4a.keywords.Common.QUOTE+" encoding="+anywheresoftware.b4a.keywords.Common.QUOTE+"UTF-8"+anywheresoftware.b4a.keywords.Common.QUOTE+">"+anywheresoftware.b4a.keywords.Common.CRLF;
 //BA.debugLineNum = 742;BA.debugLine="For i = 0 To tableDataView.Items.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_tabledataview.getItems().getSize()-1);
for (_i = (int) (0) ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
 //BA.debugLineNum = 743;BA.debugLine="Dim Row() As Object = tableDataView.Items.Get(";
_row = (Object[])(_tabledataview.getItems().Get(_i));
 //BA.debugLineNum = 744;BA.debugLine="strXMLContent = strXMLContent & \"  <record>\" &";
_strxmlcontent = _strxmlcontent+"  <record>"+anywheresoftware.b4a.keywords.Common.CRLF+"    <key>"+BA.ObjectToString(_row[(int) (0)])+"</key>"+anywheresoftware.b4a.keywords.Common.CRLF+"    <value>"+BA.ObjectToString(_row[(int) (1)])+"</value>"+anywheresoftware.b4a.keywords.Common.CRLF+"  </record>"+anywheresoftware.b4a.keywords.Common.CRLF;
 //BA.debugLineNum = 745;BA.debugLine="boolIsData = True";
_boolisdata = anywheresoftware.b4a.keywords.Common.True;
 }
};
 //BA.debugLineNum = 747;BA.debugLine="strXMLContent = strXMLContent & \"</kvs>\" & CRLF";
_strxmlcontent = _strxmlcontent+"</kvs>"+anywheresoftware.b4a.keywords.Common.CRLF;
 //BA.debugLineNum = 748;BA.debugLine="If boolIsData = True Then";
if (_boolisdata==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 749;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 750;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 751;BA.debugLine="If strExistingFilePath.Length > 0 Then";
if (_strexistingfilepath.length()>0) { 
 //BA.debugLineNum = 752;BA.debugLine="fc.InitialDirectory = strExistingFilePath";
_fc.setInitialDirectory(_strexistingfilepath);
 }else {
 //BA.debugLineNum = 754;BA.debugLine="fc.InitialDirectory = GetDataFolder(strAppNam";
_fc.setInitialDirectory(_getdatafolder(_strappname));
 };
 //BA.debugLineNum = 756;BA.debugLine="fc.InitialFileName = SuggestProfileNameForPrin";
_fc.setInitialFileName(_suggestprofilenameforprintsaveexport("xml"));
 //BA.debugLineNum = 757;BA.debugLine="fc.Title = \"Save CSV File\"";
_fc.setTitle("Save CSV File");
 //BA.debugLineNum = 758;BA.debugLine="Dim strSaveAs As String";
_strsaveas = "";
 //BA.debugLineNum = 759;BA.debugLine="strSaveAs = fc.Showsave(MainForm)";
_strsaveas = _fc.ShowSave(_mainform);
 //BA.debugLineNum = 761;BA.debugLine="If strSaveAs.Length = 0 Then Return";
if (_strsaveas.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 762;BA.debugLine="Dim fileO As JavaObject";
_fileo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 763;BA.debugLine="fileO.InitializeNewInstance(\"java.io.File\",";
_fileo.InitializeNewInstance("java.io.File",new Object[]{(Object)(_strsaveas)});
 //BA.debugLineNum = 764;BA.debugLine="Dim fileName As String";
_filename = "";
 //BA.debugLineNum = 765;BA.debugLine="Dim filePath As String";
_filepath = "";
 //BA.debugLineNum = 766;BA.debugLine="fileName = fileO.RunMethod(\"getName\", Null)";
_filename = BA.ObjectToString(_fileo.RunMethod("getName",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 767;BA.debugLine="filePath = fileO.RunMethod(\"getPath\", Null)";
_filepath = BA.ObjectToString(_fileo.RunMethod("getPath",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 768;BA.debugLine="filePath = filePath.Replace(fileName, \"\")";
_filepath = _filepath.replace(_filename,"");
 //BA.debugLineNum = 769;BA.debugLine="strExistingFilePath = filePath";
_strexistingfilepath = _filepath;
 //BA.debugLineNum = 770;BA.debugLine="File.WriteString(filePath, fileName, strXMLCon";
anywheresoftware.b4a.keywords.Common.File.WriteString(_filepath,_filename,_strxmlcontent);
 //BA.debugLineNum = 771;BA.debugLine="fx.ShowExternalDocument(File.GetUri(filePath,";
_fx.ShowExternalDocument(anywheresoftware.b4a.keywords.Common.File.GetUri(_filepath,_filename));
 //BA.debugLineNum = 772;BA.debugLine="ChangeStatusBarMessage(\"The displayed contents";
_changestatusbarmessage("The displayed contents have been exported as an XML file: "+anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 };
 };
 };
 //BA.debugLineNum = 776;BA.debugLine="End Sub";
return "";
}
public static String  _menuhelp_action() throws Exception{
String _strhtml = "";
 //BA.debugLineNum = 589;BA.debugLine="Sub menuHelp_Action";
 //BA.debugLineNum = 590;BA.debugLine="Dim strHtml As String";
_strhtml = "";
 //BA.debugLineNum = 591;BA.debugLine="strHtml = File.ReadString(File.DirAssets, \"help";
_strhtml = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"help.html");
 //BA.debugLineNum = 592;BA.debugLine="dialogue8.MessageHTMLDialog(\"KVS Viewer Help Fi";
_dialogue8._messagehtmldialog("KVS Viewer Help File",_strhtml);
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return "";
}
public static String  _menuhidetablerow_action() throws Exception{
 //BA.debugLineNum = 509;BA.debugLine="Sub menuHideTableRow_Action";
 //BA.debugLineNum = 510;BA.debugLine="If tableDataView.SelectedRow >= 0 Then";
if (_tabledataview.getSelectedRow()>=0) { 
 //BA.debugLineNum = 511;BA.debugLine="tableDataView.Items.RemoveAt(tableDataView.Selec";
_tabledataview.getItems().RemoveAt(_tabledataview.getSelectedRow());
 //BA.debugLineNum = 512;BA.debugLine="ChangeStatusBarMessage(\"The selected row has bee";
_changestatusbarmessage("The selected row has been hidden, but not deleted from the KSV file. To see the row again, click the Reload button.");
 };
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return "";
}
public static String  _menukvsdeleterecord_action() throws Exception{
Object[] _row = null;
String _strkeyname = "";
 //BA.debugLineNum = 516;BA.debugLine="Sub menuKVSDeleteRecord_Action";
 //BA.debugLineNum = 517;BA.debugLine="If tableDataView.SelectedRow >= 0 Then";
if (_tabledataview.getSelectedRow()>=0) { 
 //BA.debugLineNum = 518;BA.debugLine="If dialogue8.ConfirmationDialog(\"Key Value Store";
if (_dialogue8._confirmationdialog("Key Value Store","Live File Modification Confirmation","Do you really want to DELETE the selected key/value pair from the LIVE file?")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 519;BA.debugLine="Dim Row() As Object = tableDataView.Items.Get(t";
_row = (Object[])(_tabledataview.getItems().Get(_tabledataview.getSelectedRow()));
 //BA.debugLineNum = 520;BA.debugLine="Dim strKeyname As String = Row(0)";
_strkeyname = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 521;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 522;BA.debugLine="If kvs1.IsInitialized = True Then";
if (_kvs1.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 523;BA.debugLine="kvs1.Close";
_kvs1._close();
 };
 //BA.debugLineNum = 525;BA.debugLine="kvs1.Initialize(strExistingFilePath, strExisti";
_kvs1._initialize(ba,_strexistingfilepath,_strexistingfilename);
 //BA.debugLineNum = 526;BA.debugLine="kvs1.Remove(Row(0))";
_kvs1._remove(BA.ObjectToString(_row[(int) (0)]));
 }else {
 //BA.debugLineNum = 528;BA.debugLine="If kvs2.IsInitialized = True Then";
if (_kvs2.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 529;BA.debugLine="kvs2.Close";
_kvs2._close();
 };
 //BA.debugLineNum = 531;BA.debugLine="kvs2.Initialize(strExistingFilePath, strExisti";
_kvs2._initialize(ba,_strexistingfilepath,_strexistingfilename);
 //BA.debugLineNum = 532;BA.debugLine="kvs2.Remove(Row(0))";
_kvs2._remove(BA.ObjectToString(_row[(int) (0)]));
 };
 //BA.debugLineNum = 534;BA.debugLine="tableDataView.Items.RemoveAt(tableDataView.Sele";
_tabledataview.getItems().RemoveAt(_tabledataview.getSelectedRow());
 //BA.debugLineNum = 535;BA.debugLine="ChangeStatusBarMessage(\"The selected record for";
_changestatusbarmessage("The selected record for the key "+anywheresoftware.b4a.keywords.Common.QUOTE+_strkeyname+anywheresoftware.b4a.keywords.Common.QUOTE+" has been permanently removed from: "+BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 536;BA.debugLine="refreshTableView";
_refreshtableview();
 //BA.debugLineNum = 537;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 538;BA.debugLine="kvs1.Close";
_kvs1._close();
 }else {
 //BA.debugLineNum = 540;BA.debugLine="kvs2.Close";
_kvs2._close();
 };
 };
 };
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return "";
}
public static String  _menuvalidatorcsv_action() throws Exception{
 //BA.debugLineNum = 824;BA.debugLine="Sub menuValidatorCSV_Action";
 //BA.debugLineNum = 825;BA.debugLine="fx.ShowExternalDocument(\"http://csvlint.io/\")";
_fx.ShowExternalDocument("http://csvlint.io/");
 //BA.debugLineNum = 826;BA.debugLine="ChangeStatusBarMessage(\"Opened webpage : http://c";
_changestatusbarmessage("Opened webpage : http://csvlint.io/");
 //BA.debugLineNum = 827;BA.debugLine="End Sub";
return "";
}
public static String  _menuvalidatorjson_action() throws Exception{
 //BA.debugLineNum = 829;BA.debugLine="Sub menuValidatorJSON_Action";
 //BA.debugLineNum = 830;BA.debugLine="fx.ShowExternalDocument(\"http://jsonlint.com/\")";
_fx.ShowExternalDocument("http://jsonlint.com/");
 //BA.debugLineNum = 831;BA.debugLine="ChangeStatusBarMessage(\"Opened webpage : http://j";
_changestatusbarmessage("Opened webpage : http://jsonlint.com/");
 //BA.debugLineNum = 832;BA.debugLine="End Sub";
return "";
}
public static String  _menuvalidatorxml_action() throws Exception{
 //BA.debugLineNum = 834;BA.debugLine="Sub menuValidatorXML_Action";
 //BA.debugLineNum = 835;BA.debugLine="fx.ShowExternalDocument(\"http://www.xmlvalidation";
_fx.ShowExternalDocument("http://www.xmlvalidation.com/");
 //BA.debugLineNum = 836;BA.debugLine="ChangeStatusBarMessage(\"Opened webpage : http://w";
_changestatusbarmessage("Opened webpage : http://www.xmlvalidation.com/");
 //BA.debugLineNum = 837;BA.debugLine="End Sub";
return "";
}
public static String  _populatemainformcombobox() throws Exception{
anywheresoftware.b4a.objects.collections.List _recentfileslist = null;
int _i = 0;
 //BA.debugLineNum = 870;BA.debugLine="Sub PopulateMainFormComboBox";
 //BA.debugLineNum = 871;BA.debugLine="comboFileField.Items.Clear";
_combofilefield.getItems().Clear();
 //BA.debugLineNum = 872;BA.debugLine="Dim recentFilesList As List";
_recentfileslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 873;BA.debugLine="recentFilesList.Initialize";
_recentfileslist.Initialize();
 //BA.debugLineNum = 874;BA.debugLine="recentFilesList = kvsRecentItems.ListKeys";
_recentfileslist = _kvsrecentitems._listkeys();
 //BA.debugLineNum = 875;BA.debugLine="For i = 0 To recentFilesList.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_recentfileslist.getSize()-1);
for (_i = (int) (0) ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
 //BA.debugLineNum = 876;BA.debugLine="If recentFilesList.Get(i) <> \"\" And recentFil";
if ((_recentfileslist.Get(_i)).equals((Object)("")) == false && (_recentfileslist.Get(_i)).equals((Object)("ExistingFilePath")) == false) { 
 //BA.debugLineNum = 877;BA.debugLine="If File.Exists(kvsRecentItems.GetSimple(recentF";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_kvsrecentitems._getsimple(BA.ObjectToString(_recentfileslist.Get(_i))),BA.ObjectToString(_recentfileslist.Get(_i)))==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 878;BA.debugLine="kvsRecentItems.Remove(recentFilesList.Get(i))";
_kvsrecentitems._remove(BA.ObjectToString(_recentfileslist.Get(_i)));
 }else {
 //BA.debugLineNum = 880;BA.debugLine="comboFileField.Items.Add(File.Combine(kvsRecen";
_combofilefield.getItems().Add((Object)(anywheresoftware.b4a.keywords.Common.File.Combine(_kvsrecentitems._getsimple(BA.ObjectToString(_recentfileslist.Get(_i))),BA.ObjectToString(_recentfileslist.Get(_i)))));
 //BA.debugLineNum = 881;BA.debugLine="boolIsRecentItems = True";
_boolisrecentitems = anywheresoftware.b4a.keywords.Common.True;
 };
 };
 }
};
 //BA.debugLineNum = 885;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 //BA.debugLineNum = 886;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
createexamples2._process_globals();
createexamples._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 10;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 11;BA.debugLine="Private kvs1 As KeyValueStoreV1";
_kvs1 = new b4j.example.keyvaluestorev1();
 //BA.debugLineNum = 12;BA.debugLine="Private kvs2 As KeyValueStore";
_kvs2 = new b4j.example.keyvaluestore();
 //BA.debugLineNum = 13;BA.debugLine="Private kvsRecentItems As KeyValueStoreV1";
_kvsrecentitems = new b4j.example.keyvaluestorev1();
 //BA.debugLineNum = 14;BA.debugLine="Private dialogue8 As Dialogs8";
_dialogue8 = new b4j.example.dialogs8();
 //BA.debugLineNum = 15;BA.debugLine="Private strExistingFilePath As String";
_strexistingfilepath = "";
 //BA.debugLineNum = 16;BA.debugLine="Private strExistingFileName As String";
_strexistingfilename = "";
 //BA.debugLineNum = 17;BA.debugLine="Private tableDataView As TableView";
_tabledataview = new anywheresoftware.b4j.objects.TableViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private txtPassword As TextField";
_txtpassword = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private btnSelectFile As Button";
_btnselectfile = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private btnReload As Button";
_btnreload = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private comboFileField As ComboBox";
_combofilefield = new anywheresoftware.b4j.objects.ComboBoxWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private tableviewRowIndex As Int";
_tableviewrowindex = 0;
 //BA.debugLineNum = 23;BA.debugLine="Private tableviewColIndex As Int";
_tableviewcolindex = 0;
 //BA.debugLineNum = 24;BA.debugLine="Private tableviewCell As Object";
_tableviewcell = new Object();
 //BA.debugLineNum = 25;BA.debugLine="Private txtAddEditKeyname As TextField";
_txtaddeditkeyname = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private txtAddEditValue As TextArea";
_txtaddeditvalue = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private statusBar As StatusBar";
_statusbar = new anywheresoftware.b4j.objects.StatusBarWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private mapMenus As  Map";
_mapmenus = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 29;BA.debugLine="Private mapContextMenus As  Map";
_mapcontextmenus = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 30;BA.debugLine="Private MenuBar1 As MenuBar";
_menubar1 = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private boolIsRecentItems As Boolean";
_boolisrecentitems = false;
 //BA.debugLineNum = 32;BA.debugLine="Private boolIgnoreComoboBoxSelectedIndexChange As";
_boolignorecomoboboxselectedindexchange = false;
 //BA.debugLineNum = 33;BA.debugLine="Private radioKVSV1 As RadioButton";
_radiokvsv1 = new anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private radioKVSV2 As RadioButton";
_radiokvsv2 = new anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private radiolist As List";
_radiolist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 36;BA.debugLine="Private strAppName As String";
_strappname = "";
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public static String  _radiokvsv1_selectedchange(boolean _selected) throws Exception{
 //BA.debugLineNum = 950;BA.debugLine="Sub radioKVSV1_SelectedChange(Selected As Boolean)";
 //BA.debugLineNum = 951;BA.debugLine="If Selected = True Then";
if (_selected==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 952;BA.debugLine="If File.Exists(GetDataFolder(strAppName), \"remra";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_getdatafolder(_strappname),"remradkvsv2.txt")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 953;BA.debugLine="File.Delete(GetDataFolder(strAppName), \"remradk";
anywheresoftware.b4a.keywords.Common.File.Delete(_getdatafolder(_strappname),"remradkvsv2.txt");
 };
 //BA.debugLineNum = 955;BA.debugLine="tableDataView.Items.Clear";
_tabledataview.getItems().Clear();
 //BA.debugLineNum = 956;BA.debugLine="txtPassword.Text = \"\"";
_txtpassword.setText("");
 //BA.debugLineNum = 957;BA.debugLine="File.WriteString(GetDataFolder(strAppName), \"rem";
anywheresoftware.b4a.keywords.Common.File.WriteString(_getdatafolder(_strappname),"remradkvsv1.txt","1");
 };
 //BA.debugLineNum = 959;BA.debugLine="End Sub";
return "";
}
public static String  _radiokvsv2_selectedchange(boolean _selected) throws Exception{
 //BA.debugLineNum = 961;BA.debugLine="Sub radioKVSV2_SelectedChange(Selected As Boolean)";
 //BA.debugLineNum = 962;BA.debugLine="If Selected = True Then";
if (_selected==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 963;BA.debugLine="If File.Exists(GetDataFolder(strAppName), \"remra";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_getdatafolder(_strappname),"remradkvsv1.txt")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 964;BA.debugLine="File.Delete(GetDataFolder(strAppName), \"remradk";
anywheresoftware.b4a.keywords.Common.File.Delete(_getdatafolder(_strappname),"remradkvsv1.txt");
 };
 //BA.debugLineNum = 966;BA.debugLine="tableDataView.Items.Clear";
_tabledataview.getItems().Clear();
 //BA.debugLineNum = 967;BA.debugLine="txtPassword.Text = \"\"";
_txtpassword.setText("");
 //BA.debugLineNum = 968;BA.debugLine="File.WriteString(GetDataFolder(strAppName), \"rem";
anywheresoftware.b4a.keywords.Common.File.WriteString(_getdatafolder(_strappname),"remradkvsv2.txt","1");
 };
 //BA.debugLineNum = 970;BA.debugLine="End Sub";
return "";
}
public static String  _recentitemsenabledisablemenuitem() throws Exception{
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
 //BA.debugLineNum = 888;BA.debugLine="Sub RecentItemsEnableDisableMenuItem";
 //BA.debugLineNum = 889;BA.debugLine="If boolIsRecentItems = False Then";
if (_boolisrecentitems==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 890;BA.debugLine="If mapMenus.ContainsKey(\"mnuRecent\") = True Then";
if (_mapmenus.ContainsKey((Object)("mnuRecent"))==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 891;BA.debugLine="Dim mi As MenuItem = mapMenus.Get(\"mnuRecent\")";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapmenus.Get((Object)("mnuRecent"))));
 //BA.debugLineNum = 892;BA.debugLine="mi.Enabled = False";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
 //BA.debugLineNum = 895;BA.debugLine="If mapMenus.ContainsKey(\"mnuRecent\") = True Then";
if (_mapmenus.ContainsKey((Object)("mnuRecent"))==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 896;BA.debugLine="Dim mi As MenuItem = mapMenus.Get(\"mnuRecent\")";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapmenus.Get((Object)("mnuRecent"))));
 //BA.debugLineNum = 897;BA.debugLine="mi.Enabled = True";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 };
 //BA.debugLineNum = 900;BA.debugLine="End Sub";
return "";
}
public static String  _redirectoutput(String _dir,String _filename) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4j.object.JavaObject _ps = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 99;BA.debugLine="Sub RedirectOutput (Dir As String, FileName As Str";
 //BA.debugLineNum = 101;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir,";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_dir,_filename,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 102;BA.debugLine="Dim ps As JavaObject";
_ps = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 103;BA.debugLine="ps.InitializeNewInstance(\"java.io.PrintStream\",";
_ps.InitializeNewInstance("java.io.PrintStream",new Object[]{(Object)(_out.getObject()),(Object)(anywheresoftware.b4a.keywords.Common.True),(Object)("utf8")});
 //BA.debugLineNum = 104;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 105;BA.debugLine="jo.InitializeStatic(\"java.lang.System\")";
_jo.InitializeStatic("java.lang.System");
 //BA.debugLineNum = 106;BA.debugLine="jo.RunMethod(\"setOut\", Array(ps))";
_jo.RunMethod("setOut",new Object[]{(Object)(_ps.getObject())});
 //BA.debugLineNum = 107;BA.debugLine="jo.RunMethod(\"setErr\", Array(ps))";
_jo.RunMethod("setErr",new Object[]{(Object)(_ps.getObject())});
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public static String  _refreshtableview() throws Exception{
anywheresoftware.b4a.objects.collections.List _tempdata = null;
int _i = 0;
Object[] _r = null;
 //BA.debugLineNum = 385;BA.debugLine="Sub refreshTableView";
 //BA.debugLineNum = 386;BA.debugLine="Dim tempData As List";
_tempdata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 387;BA.debugLine="tempData.Initialize";
_tempdata.Initialize();
 //BA.debugLineNum = 388;BA.debugLine="tempData.AddAll(tableDataView.Items)";
_tempdata.AddAll(_tabledataview.getItems());
 //BA.debugLineNum = 389;BA.debugLine="tableDataView.Items.Clear";
_tabledataview.getItems().Clear();
 //BA.debugLineNum = 390;BA.debugLine="For i = 0 To tempData.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_tempdata.getSize()-1);
for (_i = (int) (0) ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
 //BA.debugLineNum = 391;BA.debugLine="Dim r() As Object = tempData.Get(i)";
_r = (Object[])(_tempdata.Get(_i));
 //BA.debugLineNum = 392;BA.debugLine="tableDataView.Items.Add(Array As Object(r(";
_tabledataview.getItems().Add((Object)(new Object[]{_r[(int) (0)],_r[(int) (1)]}));
 }
};
 //BA.debugLineNum = 394;BA.debugLine="tableDataView.SelectedRow = 0";
_tabledataview.setSelectedRow((int) (0));
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return "";
}
public static String  _saverecentitems(String _strpath,String _strfile) throws Exception{
 //BA.debugLineNum = 861;BA.debugLine="Sub SaveRecentItems(strPath As String, strFile As";
 //BA.debugLineNum = 862;BA.debugLine="If kvsRecentItems.ContainsKey(strFile) = False Th";
if (_kvsrecentitems._containskey(_strfile)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 863;BA.debugLine="kvsRecentItems.PutSimple(strFile, strPath)";
_kvsrecentitems._putsimple(_strfile,(Object)(_strpath));
 //BA.debugLineNum = 864;BA.debugLine="boolIsRecentItems = True";
_boolisrecentitems = anywheresoftware.b4a.keywords.Common.True;
 };
 //BA.debugLineNum = 866;BA.debugLine="PopulateMainFormComboBox";
_populatemainformcombobox();
 //BA.debugLineNum = 867;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 //BA.debugLineNum = 868;BA.debugLine="End Sub";
return "";
}
public static String  _suggestprofilenameforprintsaveexport(String _typeoffile) throws Exception{
String _suggestfilename = "";
long _now = 0L;
String _year = "";
String _month = "";
String _day = "";
String _hour = "";
String _minute = "";
String _second = "";
String _strkvsleader = "";
 //BA.debugLineNum = 904;BA.debugLine="Sub SuggestProfileNameForPrintSaveExport(TypeOfFil";
 //BA.debugLineNum = 906;BA.debugLine="Dim suggestFileName As String";
_suggestfilename = "";
 //BA.debugLineNum = 907;BA.debugLine="Dim now As Long";
_now = 0L;
 //BA.debugLineNum = 908;BA.debugLine="now = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 909;BA.debugLine="Dim year As String = DateTime.GetYear(now)";
_year = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_now));
 //BA.debugLineNum = 910;BA.debugLine="Dim month As String = DateTime.GetMonth(now)";
_month = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_now));
 //BA.debugLineNum = 911;BA.debugLine="Dim day As String = DateTime.GetDayOfMonth(now)";
_day = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(_now));
 //BA.debugLineNum = 912;BA.debugLine="Dim hour As String = DateTime.GetHour(now)";
_hour = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetHour(_now));
 //BA.debugLineNum = 913;BA.debugLine="Dim minute As String = DateTime.GetMinute(now)";
_minute = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetMinute(_now));
 //BA.debugLineNum = 914;BA.debugLine="Dim second As String = DateTime.GetSecond(now)";
_second = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetSecond(_now));
 //BA.debugLineNum = 915;BA.debugLine="Dim strKvsLeader As String";
_strkvsleader = "";
 //BA.debugLineNum = 916;BA.debugLine="If radioKVSV1.Selected = True Then";
if (_radiokvsv1.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 917;BA.debugLine="strKvsLeader = \"kvs_\"";
_strkvsleader = "kvs_";
 }else {
 //BA.debugLineNum = 919;BA.debugLine="strKvsLeader = \"kvs2_\"";
_strkvsleader = "kvs2_";
 };
 //BA.debugLineNum = 921;BA.debugLine="If TypeOfFile = \"csv\" Then";
if ((_typeoffile).equals("csv")) { 
 //BA.debugLineNum = 922;BA.debugLine="suggestFileName = strKvsLeader & year & \"-\" & mo";
_suggestfilename = _strkvsleader+_year+"-"+_month+"-"+_day+"_"+_hour+"-"+_minute+"-"+_second+".csv";
 }else if((_typeoffile).equals("json")) { 
 //BA.debugLineNum = 924;BA.debugLine="suggestFileName = strKvsLeader & year & \"-\" & mo";
_suggestfilename = _strkvsleader+_year+"-"+_month+"-"+_day+"_"+_hour+"-"+_minute+"-"+_second+".json";
 }else if((_typeoffile).equals("xml")) { 
 //BA.debugLineNum = 926;BA.debugLine="suggestFileName = strKvsLeader & year & \"-\" & mo";
_suggestfilename = _strkvsleader+_year+"-"+_month+"-"+_day+"_"+_hour+"-"+_minute+"-"+_second+".xml";
 }else {
 //BA.debugLineNum = 928;BA.debugLine="suggestFileName = strKvsLeader & year & \"-\" & mo";
_suggestfilename = _strkvsleader+_year+"-"+_month+"-"+_day+"_"+_hour+"-"+_minute+"-"+_second+".txt";
 };
 //BA.debugLineNum = 930;BA.debugLine="Return suggestFileName";
if (true) return _suggestfilename;
 //BA.debugLineNum = 931;BA.debugLine="End Sub";
return "";
}
public static String  _tabledataview_selectedcellchanged(int _rowindex,int _colindex,Object _cell) throws Exception{
 //BA.debugLineNum = 944;BA.debugLine="Sub tableDataView_SelectedCellChanged (RowIndex As";
 //BA.debugLineNum = 945;BA.debugLine="tableviewRowIndex = RowIndex";
_tableviewrowindex = _rowindex;
 //BA.debugLineNum = 946;BA.debugLine="tableviewColIndex = ColIndex";
_tableviewcolindex = _colindex;
 //BA.debugLineNum = 947;BA.debugLine="tableviewCell = Cell";
_tableviewcell = _cell;
 //BA.debugLineNum = 948;BA.debugLine="End Sub";
return "";
}
public static String  _txtpassword_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 972;BA.debugLine="Sub txtPassword_TextChanged (Old As String, New As";
 //BA.debugLineNum = 973;BA.debugLine="If Old <> New Then";
if ((_old).equals(_new) == false) { 
 //BA.debugLineNum = 974;BA.debugLine="tableDataView.Items.Clear";
_tabledataview.getItems().Clear();
 };
 //BA.debugLineNum = 976;BA.debugLine="End Sub";
return "";
}
}
