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
public static b4j.example.keyvaluestore _kvs = null;
public static b4j.example.keyvaluestore _kvsrecentitems = null;
public static b4j.example.dialogs8 _dialogue8 = null;
public static String _strexistingfilepath = "";
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
public static anywheresoftware.b4a.objects.Timer _tmr = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblstatus = null;
public static anywheresoftware.b4j.objects.StatusBarWrapper _statusbar = null;
public static anywheresoftware.b4a.objects.collections.Map _mapmenus = null;
public static anywheresoftware.b4a.objects.collections.Map _mapcontextmenus = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static boolean _boolisrecentitems = false;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 35;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 36;BA.debugLine="MainForm.SetFormStyle(\"UNIFIED\")";
_mainform.SetFormStyle("UNIFIED");
 //BA.debugLineNum = 37;BA.debugLine="MainForm.RootPane.LoadLayout(\"main_form\") 'Load t";
_mainform.getRootPane().LoadLayout(ba,"main_form");
 //BA.debugLineNum = 38;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"Gla";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Glasses.png").getObject()));
 //BA.debugLineNum = 39;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 40;BA.debugLine="statusBar.Initialize(\"statusBar\")";
_statusbar.Initialize(ba,"statusBar");
 //BA.debugLineNum = 41;BA.debugLine="MainForm.RootPane.AddNode(statusBar, 0, 0, -1, 30";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_statusbar.getObject()),0,0,-1,30);
 //BA.debugLineNum = 42;BA.debugLine="MainForm.RootPane.SetAnchors(statusBar, 0, -1, 0,";
_mainform.getRootPane().SetAnchors((javafx.scene.Node)(_statusbar.getObject()),0,-1,0,0);
 //BA.debugLineNum = 43;BA.debugLine="statusBar.Text = \"KSV Viewer 1.0\"";
_statusbar.setText("KSV Viewer 1.0");
 //BA.debugLineNum = 44;BA.debugLine="dialogue8.Initialize";
_dialogue8._initialize(ba);
 //BA.debugLineNum = 45;BA.debugLine="tableDataView.SetColumnHeader(0, \"Key\")";
_tabledataview.SetColumnHeader((int) (0),"Key");
 //BA.debugLineNum = 46;BA.debugLine="tableDataView.SetColumnHeader(1, \"Contents\")";
_tabledataview.SetColumnHeader((int) (1),"Contents");
 //BA.debugLineNum = 47;BA.debugLine="tableDataView.SetColumnWidth(0, 200.00)";
_tabledataview.SetColumnWidth((int) (0),200.00);
 //BA.debugLineNum = 48;BA.debugLine="tableDataView.SetColumnWidth(1, 740.00)";
_tabledataview.SetColumnWidth((int) (1),740.00);
 //BA.debugLineNum = 49;BA.debugLine="tableDataView.SetColumnSortable(0, True)";
_tabledataview.SetColumnSortable((int) (0),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 50;BA.debugLine="tableDataView.SetColumnSortable(1, True)";
_tabledataview.SetColumnSortable((int) (1),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 51;BA.debugLine="tableDataView.SingleCellSelection = True";
_tabledataview.setSingleCellSelection(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 52;BA.debugLine="kvsRecentItems.Initialize(GetDataFolder(\"KVSViewe";
_kvsrecentitems._initialize(ba,_getdatafolder("KVSViewer"),"recentitems.data");
 //BA.debugLineNum = 53;BA.debugLine="If kvsRecentItems.ContainsKey(\"ExistingFilePath\")";
if (_kvsrecentitems._containskey("ExistingFilePath")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 54;BA.debugLine="strExistingFilePath = kvsRecentItems.GetSimple(\"";
_strexistingfilepath = _kvsrecentitems._getsimple("ExistingFilePath");
 };
 //BA.debugLineNum = 56;BA.debugLine="mapMenus.Initialize";
_mapmenus.Initialize();
 //BA.debugLineNum = 57;BA.debugLine="CollectMenuItems(mapMenus, MenuBar1.Menus)";
_collectmenuitems(_mapmenus,_menubar1.getMenus());
 //BA.debugLineNum = 58;BA.debugLine="mapContextMenus.Initialize";
_mapcontextmenus.Initialize();
 //BA.debugLineNum = 59;BA.debugLine="CollectContextMenuItems(mapContextMenus, tableDat";
_collectcontextmenuitems(_mapcontextmenus,_tabledataview.getContextMenu().getMenuItems());
 //BA.debugLineNum = 60;BA.debugLine="MenuDisableItems";
_menudisableitems();
 //BA.debugLineNum = 61;BA.debugLine="PopulateMainFormComboBox";
_populatemainformcombobox();
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public static String  _btnaddedit_action() throws Exception{
String _strpath = "";
String _strfile = "";
 //BA.debugLineNum = 93;BA.debugLine="Sub btnAddEdit_Action";
 //BA.debugLineNum = 94;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 95;BA.debugLine="If comboFileField.Items.Get(comboFileField.Selec";
if ((_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())).equals((Object)("")) == false) { 
 //BA.debugLineNum = 96;BA.debugLine="Dim strPath As String";
_strpath = "";
 //BA.debugLineNum = 97;BA.debugLine="Dim strFile As String";
_strfile = "";
 //BA.debugLineNum = 98;BA.debugLine="strPath = File.GetFileParent(comboFileField.Ite";
_strpath = anywheresoftware.b4a.keywords.Common.File.GetFileParent(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 99;BA.debugLine="strFile = File.GetName(comboFileField.Items.Get";
_strfile = anywheresoftware.b4a.keywords.Common.File.GetName(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 100;BA.debugLine="If File.IsDirectory(strPath, strFile) = True Th";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_strpath,_strfile)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 101;BA.debugLine="dialogue8.WarningDialog(\"File Selection Error\"";
_dialogue8._warningdialog("File Selection Error","No File Selected","You must select a file to import.");
 //BA.debugLineNum = 102;BA.debugLine="MenuDisableItems";
_menudisableitems();
 //BA.debugLineNum = 103;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 }else {
 //BA.debugLineNum = 105;BA.debugLine="DisplayStatusMessage(\"File Loading...\")";
_displaystatusmessage("File Loading...");
 //BA.debugLineNum = 106;BA.debugLine="ChangeStatusBarMessage(\"File Loading ...\")";
_changestatusbarmessage("File Loading ...");
 //BA.debugLineNum = 107;BA.debugLine="strExistingFilePath = strPath";
_strexistingfilepath = _strpath;
 //BA.debugLineNum = 108;BA.debugLine="If kvs.IsInitialized = True Then";
if (_kvs.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 109;BA.debugLine="kvs.Close";
_kvs._close();
 };
 //BA.debugLineNum = 111;BA.debugLine="kvs.Initialize(strPath, strFile)";
_kvs._initialize(ba,_strpath,_strfile);
 //BA.debugLineNum = 112;BA.debugLine="If txtPassword.Text <> \"\" Then";
if ((_txtpassword.getText()).equals("") == false) { 
 //BA.debugLineNum = 113;BA.debugLine="kvs.PutEncyptedObject(txtAddEditKeyname.Text,";
_kvs._putencyptedobject(_txtaddeditkeyname.getText(),(Object)(_txtaddeditvalue.getText()),_txtpassword.getText());
 }else {
 //BA.debugLineNum = 115;BA.debugLine="kvs.PutSimple(txtAddEditKeyname.Text, txtAddE";
_kvs._putsimple(_txtaddeditkeyname.getText(),(Object)(_txtaddeditvalue.getText()));
 };
 //BA.debugLineNum = 117;BA.debugLine="refreshTableView";
_refreshtableview();
 //BA.debugLineNum = 118;BA.debugLine="txtAddEditKeyname.Text = \"\"";
_txtaddeditkeyname.setText("");
 //BA.debugLineNum = 119;BA.debugLine="txtAddEditValue.Text = \"\"";
_txtaddeditvalue.setText("");
 //BA.debugLineNum = 120;BA.debugLine="MenuEnableItems";
_menuenableitems();
 //BA.debugLineNum = 121;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 //BA.debugLineNum = 122;BA.debugLine="DisplayStatusMessage(\"Key/Value updated comple";
_displaystatusmessage("Key/Value updated completed.");
 //BA.debugLineNum = 123;BA.debugLine="ChangeStatusBarMessage(\"Key/Value pair updated";
_changestatusbarmessage("Key/Value pair updated. If the key did not exist it was added.");
 };
 };
 };
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public static String  _btnreload_action() throws Exception{
String _strpath = "";
String _strfile = "";
 //BA.debugLineNum = 133;BA.debugLine="Sub btnReload_Action";
 //BA.debugLineNum = 134;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 135;BA.debugLine="If comboFileField.Items.Get(comboFileField.Selec";
if ((_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())).equals((Object)("")) == false) { 
 //BA.debugLineNum = 136;BA.debugLine="Dim strPath As String";
_strpath = "";
 //BA.debugLineNum = 137;BA.debugLine="Dim strFile As String";
_strfile = "";
 //BA.debugLineNum = 138;BA.debugLine="strPath = File.GetFileParent(comboFileField.Ite";
_strpath = anywheresoftware.b4a.keywords.Common.File.GetFileParent(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 139;BA.debugLine="strFile = File.GetName(comboFileField.Items.Get";
_strfile = anywheresoftware.b4a.keywords.Common.File.GetName(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 140;BA.debugLine="If File.IsDirectory(strPath, strFile) = True Th";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_strpath,_strfile)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 141;BA.debugLine="fx.Msgbox(MainForm, \"You must select a file to";
_fx.Msgbox(_mainform,"You must select a file to import.","No File Selected");
 //BA.debugLineNum = 142;BA.debugLine="MenuDisableItems";
_menudisableitems();
 //BA.debugLineNum = 143;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 }else {
 //BA.debugLineNum = 145;BA.debugLine="DisplayStatusMessage(\"File Loading...\")";
_displaystatusmessage("File Loading...");
 //BA.debugLineNum = 146;BA.debugLine="ChangeStatusBarMessage(\"File Loading ...\")";
_changestatusbarmessage("File Loading ...");
 //BA.debugLineNum = 147;BA.debugLine="strExistingFilePath = strPath";
_strexistingfilepath = _strpath;
 //BA.debugLineNum = 148;BA.debugLine="If kvs.IsInitialized = True Then";
if (_kvs.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 149;BA.debugLine="kvs.Close";
_kvs._close();
 };
 //BA.debugLineNum = 151;BA.debugLine="kvs.Initialize(strPath, strFile)";
_kvs._initialize(ba,_strpath,_strfile);
 //BA.debugLineNum = 152;BA.debugLine="LoadKVSData";
_loadkvsdata();
 //BA.debugLineNum = 153;BA.debugLine="tmr.Initialize(\"Timer1\", 3000)";
_tmr.Initialize(ba,"Timer1",(long) (3000));
 //BA.debugLineNum = 154;BA.debugLine="tmr.Enabled = True";
_tmr.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 155;BA.debugLine="MenuEnableItems";
_menuenableitems();
 //BA.debugLineNum = 156;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 //BA.debugLineNum = 157;BA.debugLine="DisplayStatusMessage(\"File reloaded.\")";
_displaystatusmessage("File reloaded.");
 //BA.debugLineNum = 158;BA.debugLine="ChangeStatusBarMessage(\"File reloaded.\")";
_changestatusbarmessage("File reloaded.");
 };
 };
 };
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public static String  _btnselectfile_action() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub btnSelectFile_Action";
 //BA.debugLineNum = 130;BA.debugLine="LoadFile";
_loadfile();
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public static String  _changestatusbarmessage(String _strmessage) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub ChangeStatusBarMessage(strMessage As String)";
 //BA.debugLineNum = 86;BA.debugLine="statusBar.Text = strMessage";
_statusbar.setText(_strmessage);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public static String  _clearrecentitemslist() throws Exception{
int _i = 0;
 //BA.debugLineNum = 729;BA.debugLine="Sub ClearRecentItemsList";
 //BA.debugLineNum = 730;BA.debugLine="If comboFileField.Items.Size > 1 Then";
if (_combofilefield.getItems().getSize()>1) { 
 //BA.debugLineNum = 731;BA.debugLine="If dialogue8.ConfirmationDialog(\"Recent Items Li";
if (_dialogue8._confirmationdialog("Recent Items List","Clear Recent Items List","Do you really want to empty the recent items list?")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 732;BA.debugLine="kvsRecentItems.DeleteAll";
_kvsrecentitems._deleteall();
 //BA.debugLineNum = 734;BA.debugLine="For i = comboFileField.Items.Size - 1 To 0 Step";
{
final int step4 = (int) (-1);
final int limit4 = (int) (0);
for (_i = (int) (_combofilefield.getItems().getSize()-1) ; (step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4); _i = ((int)(0 + _i + step4)) ) {
 //BA.debugLineNum = 735;BA.debugLine="If comboFileField.SelectedIndex <> i Then";
if (_combofilefield.getSelectedIndex()!=_i) { 
 //BA.debugLineNum = 736;BA.debugLine="comboFileField.Items.RemoveAt(i)";
_combofilefield.getItems().RemoveAt(_i);
 };
 }
};
 //BA.debugLineNum = 739;BA.debugLine="boolIsRecentItems = False";
_boolisrecentitems = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 740;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 };
 };
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return "";
}
public static String  _collectcontextmenuitems(anywheresoftware.b4a.objects.collections.Map _contextmenus,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper _mn = null;
 //BA.debugLineNum = 309;BA.debugLine="Private Sub CollectContextMenuItems(ContextMenus A";
 //BA.debugLineNum = 310;BA.debugLine="For Each mi As MenuItem In Items";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize();
for (int index1 = 0;index1 < groupLen1 ;index1++){
_mi.setObject((javafx.scene.control.MenuItem)(group1.Get(index1)));
 //BA.debugLineNum = 311;BA.debugLine="If mi.Tag <> Null And mi.Tag <> \"\" Then Conte";
if (_mi.getTag()!= null && (_mi.getTag()).equals((Object)("")) == false) { 
_contextmenus.Put(_mi.getTag(),(Object)(_mi.getObject()));};
 //BA.debugLineNum = 312;BA.debugLine="If mi Is Menu Then";
if (_mi.getObjectOrNull() instanceof javafx.scene.control.Menu) { 
 //BA.debugLineNum = 313;BA.debugLine="Dim mn As Menu = mi";
_mn = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper();
_mn.setObject((javafx.scene.control.Menu)(_mi.getObject()));
 //BA.debugLineNum = 314;BA.debugLine="CollectContextMenuItems(ContextMenus, mn.Me";
_collectcontextmenuitems(_contextmenus,_mn.getMenuItems());
 };
 }
;
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return "";
}
public static String  _collectmenuitems(anywheresoftware.b4a.objects.collections.Map _menus,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper _mn = null;
 //BA.debugLineNum = 299;BA.debugLine="Private Sub CollectMenuItems(Menus As Map, Items A";
 //BA.debugLineNum = 300;BA.debugLine="For Each mi As MenuItem In Items";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize();
for (int index1 = 0;index1 < groupLen1 ;index1++){
_mi.setObject((javafx.scene.control.MenuItem)(group1.Get(index1)));
 //BA.debugLineNum = 301;BA.debugLine="If mi.Tag <> Null And mi.Tag <> \"\" Then Menus";
if (_mi.getTag()!= null && (_mi.getTag()).equals((Object)("")) == false) { 
_menus.Put(_mi.getTag(),(Object)(_mi.getObject()));};
 //BA.debugLineNum = 302;BA.debugLine="If mi Is Menu Then";
if (_mi.getObjectOrNull() instanceof javafx.scene.control.Menu) { 
 //BA.debugLineNum = 303;BA.debugLine="Dim mn As Menu = mi";
_mn = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper();
_mn.setObject((javafx.scene.control.Menu)(_mi.getObject()));
 //BA.debugLineNum = 304;BA.debugLine="CollectMenuItems(Menus, mn.MenuItems)";
_collectmenuitems(_menus,_mn.getMenuItems());
 };
 }
;
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return "";
}
public static String  _combofilefield_selectedindexchanged(int _index,Object _value) throws Exception{
String _strfile = "";
 //BA.debugLineNum = 171;BA.debugLine="Sub comboFileField_SelectedIndexChanged(Index As I";
 //BA.debugLineNum = 172;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 173;BA.debugLine="If comboFileField.Items.Get(comboFileField.Selec";
if ((_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())).equals((Object)("")) == false) { 
 //BA.debugLineNum = 174;BA.debugLine="Dim strFile As String";
_strfile = "";
 //BA.debugLineNum = 175;BA.debugLine="strExistingFilePath = File.GetFileParent(comboF";
_strexistingfilepath = anywheresoftware.b4a.keywords.Common.File.GetFileParent(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 176;BA.debugLine="kvsRecentItems.PutSimple(\"ExistingFilePath\", st";
_kvsrecentitems._putsimple("ExistingFilePath",(Object)(_strexistingfilepath));
 //BA.debugLineNum = 177;BA.debugLine="strFile = File.GetName(comboFileField.Items.Get";
_strfile = anywheresoftware.b4a.keywords.Common.File.GetName(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 178;BA.debugLine="If File.IsDirectory(strExistingFilePath, strFil";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_strexistingfilepath,_strfile)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 179;BA.debugLine="fx.Msgbox(MainForm, \"You must select a file to";
_fx.Msgbox(_mainform,"You must select a file to import.","No File Selected");
 //BA.debugLineNum = 180;BA.debugLine="MenuDisableItems";
_menudisableitems();
 }else {
 //BA.debugLineNum = 182;BA.debugLine="DisplayStatusMessage(\"File Loading...\")";
_displaystatusmessage("File Loading...");
 //BA.debugLineNum = 183;BA.debugLine="ChangeStatusBarMessage(\"File Loading ...\")";
_changestatusbarmessage("File Loading ...");
 //BA.debugLineNum = 184;BA.debugLine="If kvs.IsInitialized = True Then";
if (_kvs.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 185;BA.debugLine="kvs.Close";
_kvs._close();
 };
 //BA.debugLineNum = 187;BA.debugLine="kvs.Initialize(strExistingFilePath, strFile)";
_kvs._initialize(ba,_strexistingfilepath,_strfile);
 //BA.debugLineNum = 188;BA.debugLine="LoadKVSData";
_loadkvsdata();
 //BA.debugLineNum = 189;BA.debugLine="MenuEnableItems";
_menuenableitems();
 //BA.debugLineNum = 190;BA.debugLine="ChangeStatusBarMessage(\"File loaded: \" & combo";
_changestatusbarmessage("File loaded: "+BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 };
 };
 }else {
 //BA.debugLineNum = 194;BA.debugLine="tableDataView.Items.Clear";
_tabledataview.getItems().Clear();
 //BA.debugLineNum = 195;BA.debugLine="MenuDisableItems";
_menudisableitems();
 //BA.debugLineNum = 196;BA.debugLine="ChangeStatusBarMessage(\"\")";
_changestatusbarmessage("");
 };
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public static String  _combofilefield_valuechanged(Object _value) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub comboFileField_ValueChanged (Value As Object)";
 //BA.debugLineNum = 165;BA.debugLine="If Value = Null Then";
if (_value== null) { 
 //BA.debugLineNum = 166;BA.debugLine="menuClearData_Action";
_menucleardata_action();
 //BA.debugLineNum = 167;BA.debugLine="MenuDisableItems";
_menudisableitems();
 };
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public static String  _displaystatusmessage(String _strmessage) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub DisplayStatusMessage(strMessage As String)";
 //BA.debugLineNum = 73;BA.debugLine="If strMessage <> \"\" Then";
if ((_strmessage).equals("") == false) { 
 //BA.debugLineNum = 74;BA.debugLine="lblStatus.Text = strMessage";
_lblstatus.setText(_strmessage);
 //BA.debugLineNum = 75;BA.debugLine="tmr.Initialize(\"Timer1\", 5000)";
_tmr.Initialize(ba,"Timer1",(long) (5000));
 //BA.debugLineNum = 76;BA.debugLine="tmr.Enabled = True";
_tmr.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _getdatafolder(String _appname) throws Exception{
String _os = "";
String _wf = "";
 //BA.debugLineNum = 811;BA.debugLine="Sub GetDataFolder (AppName As String) As String";
 //BA.debugLineNum = 812;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
 //BA.debugLineNum = 813;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
 //BA.debugLineNum = 814;BA.debugLine="Dim wf As String = File.Combine(GetEnvironmen";
_wf = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.GetEnvironmentVariable("AppData",""),_appname);
 //BA.debugLineNum = 815;BA.debugLine="File.MakeDir(wf, \"\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_wf,"");
 //BA.debugLineNum = 816;BA.debugLine="Return wf";
if (true) return _wf;
 }else {
 //BA.debugLineNum = 818;BA.debugLine="Return File.DirApp";
if (true) return anywheresoftware.b4a.keywords.Common.File.getDirApp();
 };
 //BA.debugLineNum = 820;BA.debugLine="End Sub";
return "";
}
public static String  _loadfile() throws Exception{
anywheresoftware.b4j.objects.FileChooserWrapper _saveopenfile = null;
String _strfilepath = "";
String _strpath = "";
String _strfile = "";
boolean _boolisinlist = false;
int _i = 0;
 //BA.debugLineNum = 200;BA.debugLine="Sub LoadFile";
 //BA.debugLineNum = 201;BA.debugLine="Dim saveopenFile As FileChooser";
_saveopenfile = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 202;BA.debugLine="saveopenFile.Initialize";
_saveopenfile.Initialize();
 //BA.debugLineNum = 203;BA.debugLine="If strExistingFilePath <> \"\" Then";
if ((_strexistingfilepath).equals("") == false) { 
 //BA.debugLineNum = 204;BA.debugLine="saveopenFile.InitialDirectory = strExistingFi";
_saveopenfile.setInitialDirectory(_strexistingfilepath);
 }else {
 //BA.debugLineNum = 206;BA.debugLine="saveopenFile.InitialDirectory = GetDataFolder(\"K";
_saveopenfile.setInitialDirectory(_getdatafolder("KVSViewer"));
 };
 //BA.debugLineNum = 208;BA.debugLine="Dim strFilePath As String";
_strfilepath = "";
 //BA.debugLineNum = 209;BA.debugLine="strFilePath = saveopenFile.ShowOpen(MainForm)";
_strfilepath = _saveopenfile.ShowOpen(_mainform);
 //BA.debugLineNum = 210;BA.debugLine="MenuDisableItems";
_menudisableitems();
 //BA.debugLineNum = 211;BA.debugLine="If strFilePath <> \"\" Then";
if ((_strfilepath).equals("") == false) { 
 //BA.debugLineNum = 212;BA.debugLine="DisplayStatusMessage(\"File Loading...\")";
_displaystatusmessage("File Loading...");
 //BA.debugLineNum = 213;BA.debugLine="ChangeStatusBarMessage(\"File Loading ...\")";
_changestatusbarmessage("File Loading ...");
 //BA.debugLineNum = 214;BA.debugLine="Dim strPath As String";
_strpath = "";
 //BA.debugLineNum = 215;BA.debugLine="Dim strFile As String";
_strfile = "";
 //BA.debugLineNum = 216;BA.debugLine="strPath = File.GetFileParent(strFilePath)";
_strpath = anywheresoftware.b4a.keywords.Common.File.GetFileParent(_strfilepath);
 //BA.debugLineNum = 217;BA.debugLine="strFile = File.GetName(strFilePath)";
_strfile = anywheresoftware.b4a.keywords.Common.File.GetName(_strfilepath);
 //BA.debugLineNum = 218;BA.debugLine="SaveRecentItems(strPath, strFile)";
_saverecentitems(_strpath,_strfile);
 //BA.debugLineNum = 219;BA.debugLine="Dim boolIsInList As Boolean = False";
_boolisinlist = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 220;BA.debugLine="For i = 0 To comboFileField.Items.Size - 1";
{
final int step20 = 1;
final int limit20 = (int) (_combofilefield.getItems().getSize()-1);
for (_i = (int) (0) ; (step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20); _i = ((int)(0 + _i + step20)) ) {
 //BA.debugLineNum = 221;BA.debugLine="If comboFileField.Items.Get(i) = strFilePath Th";
if ((_combofilefield.getItems().Get(_i)).equals((Object)(_strfilepath))) { 
 //BA.debugLineNum = 222;BA.debugLine="boolIsInList = True";
_boolisinlist = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 223;BA.debugLine="comboFileField.SelectedIndex = i";
_combofilefield.setSelectedIndex(_i);
 };
 }
};
 //BA.debugLineNum = 226;BA.debugLine="If boolIsInList = False Then";
if (_boolisinlist==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 227;BA.debugLine="comboFileField.Items.InsertAt(0, strFilePath)";
_combofilefield.getItems().InsertAt((int) (0),(Object)(_strfilepath));
 //BA.debugLineNum = 228;BA.debugLine="comboFileField.SelectedIndex = 0";
_combofilefield.setSelectedIndex((int) (0));
 };
 //BA.debugLineNum = 230;BA.debugLine="MenuEnableItems";
_menuenableitems();
 //BA.debugLineNum = 231;BA.debugLine="ChangeStatusBarMessage(\"File loaded: \" & comboFi";
_changestatusbarmessage("File loaded: "+BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 };
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return "";
}
public static String  _loadkvsdata() throws Exception{
anywheresoftware.b4a.objects.collections.List _listkeys = null;
int _i = 0;
Object[] _row = null;
String _strkeyname = "";
anywheresoftware.b4j.objects.ImageViewWrapper _im = null;
 //BA.debugLineNum = 235;BA.debugLine="Sub LoadKVSData";
 //BA.debugLineNum = 236;BA.debugLine="tableDataView.Items.Clear";
_tabledataview.getItems().Clear();
 //BA.debugLineNum = 237;BA.debugLine="Dim listKeys As List";
_listkeys = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 238;BA.debugLine="listKeys.Initialize";
_listkeys.Initialize();
 //BA.debugLineNum = 239;BA.debugLine="listKeys = kvs.ListKeys";
_listkeys = _kvs._listkeys();
 //BA.debugLineNum = 240;BA.debugLine="For i = 0 To listKeys.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_listkeys.getSize()-1);
for (_i = (int) (0) ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
 //BA.debugLineNum = 241;BA.debugLine="Dim Row(2) As Object";
_row = new Object[(int) (2)];
{
int d0 = _row.length;
for (int i0 = 0;i0 < d0;i0++) {
_row[i0] = new Object();
}
}
;
 //BA.debugLineNum = 242;BA.debugLine="Row(0) = listKeys.Get(i)";
_row[(int) (0)] = _listkeys.Get(_i);
 //BA.debugLineNum = 243;BA.debugLine="Dim strKeyName As String = listKeys.Get(i)";
_strkeyname = BA.ObjectToString(_listkeys.Get(_i));
 //BA.debugLineNum = 244;BA.debugLine="strKeyName = strKeyName.ToLowerCase";
_strkeyname = _strkeyname.toLowerCase();
 //BA.debugLineNum = 245;BA.debugLine="If txtPassword.Text <> \"\" Then";
if ((_txtpassword.getText()).equals("") == false) { 
 //BA.debugLineNum = 246;BA.debugLine="Try";
try { //BA.debugLineNum = 247;BA.debugLine="Row(1) = kvs.GetEncryptedObject(listKeys.Get(i";
_row[(int) (1)] = _kvs._getencryptedobject(BA.ObjectToString(_listkeys.Get(_i)),_txtpassword.getText());
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 249;BA.debugLine="If strKeyName.Contains(\".jpg\") = True Or strKe";
if (_strkeyname.contains(".jpg")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".jpeg")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".gif")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".png")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".bmp")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 250;BA.debugLine="strKeyName.Contains(\".jpg\")";
_strkeyname.contains(".jpg");
 //BA.debugLineNum = 251;BA.debugLine="Dim im As ImageView";
_im = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 252;BA.debugLine="im.Initialize(\"im\")";
_im.Initialize(ba,"im");
 //BA.debugLineNum = 253;BA.debugLine="im.SetImage(kvs.GetBitmap(listKeys.Get(i)))";
_im.SetImage((javafx.scene.image.Image)(_kvs._getbitmap(BA.ObjectToString(_listkeys.Get(_i))).getObject()));
 //BA.debugLineNum = 254;BA.debugLine="Row(1) = im";
_row[(int) (1)] = (Object)(_im.getObject());
 }else {
 //BA.debugLineNum = 256;BA.debugLine="Try";
try { //BA.debugLineNum = 257;BA.debugLine="Row(1) = kvs.GetObject(listKeys.Get(i))";
_row[(int) (1)] = _kvs._getobject(BA.ObjectToString(_listkeys.Get(_i)));
 } 
       catch (Exception e24) {
			ba.setLastException(e24); //BA.debugLineNum = 259;BA.debugLine="Row(1) = kvs.GetSimple(listKeys.Get(i))";
_row[(int) (1)] = (Object)(_kvs._getsimple(BA.ObjectToString(_listkeys.Get(_i))));
 };
 };
 };
 }else {
 //BA.debugLineNum = 264;BA.debugLine="If strKeyName.Contains(\".jpg\") = True Or strKey";
if (_strkeyname.contains(".jpg")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".jpeg")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".gif")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".png")==anywheresoftware.b4a.keywords.Common.True || _strkeyname.contains(".bmp")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 265;BA.debugLine="strKeyName.Contains(\".jpg\")";
_strkeyname.contains(".jpg");
 //BA.debugLineNum = 266;BA.debugLine="Dim im As ImageView";
_im = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 267;BA.debugLine="im.Initialize(\"im\")";
_im.Initialize(ba,"im");
 //BA.debugLineNum = 268;BA.debugLine="im.SetImage(kvs.GetBitmap(listKeys.Get(i)))";
_im.SetImage((javafx.scene.image.Image)(_kvs._getbitmap(BA.ObjectToString(_listkeys.Get(_i))).getObject()));
 //BA.debugLineNum = 269;BA.debugLine="Row(1) = im";
_row[(int) (1)] = (Object)(_im.getObject());
 }else {
 //BA.debugLineNum = 271;BA.debugLine="Try";
try { //BA.debugLineNum = 272;BA.debugLine="Row(1) = kvs.GetObject(listKeys.Get(i))";
_row[(int) (1)] = _kvs._getobject(BA.ObjectToString(_listkeys.Get(_i)));
 } 
       catch (Exception e39) {
			ba.setLastException(e39); //BA.debugLineNum = 274;BA.debugLine="Row(1) = kvs.GetSimple(listKeys.Get(i))";
_row[(int) (1)] = (Object)(_kvs._getsimple(BA.ObjectToString(_listkeys.Get(_i))));
 };
 };
 };
 //BA.debugLineNum = 278;BA.debugLine="tableDataView.Items.Add(Row)";
_tabledataview.getItems().Add((Object)(_row));
 }
};
 //BA.debugLineNum = 280;BA.debugLine="refreshTableView";
_refreshtableview();
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub MainForm_Resize (Width As Double, Height As Do";
 //BA.debugLineNum = 65;BA.debugLine="If MainForm.Width < 600.00 Then";
if (_mainform.getWidth()<600.00) { 
 //BA.debugLineNum = 66;BA.debugLine="MainForm.WindowWidth = 600.00";
_mainform.setWindowWidth(600.00);
 };
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _menuabout_action() throws Exception{
 //BA.debugLineNum = 462;BA.debugLine="Sub menuAbout_Action";
 //BA.debugLineNum = 463;BA.debugLine="dialogue8.InformationDialog(\"About\", \"KVS View";
_dialogue8._informationdialog("About","KVS Viewer V1.0"+anywheresoftware.b4a.keywords.Common.CRLF+"Copyright © 2016, James Melanson","KVS Viewer allows you to view the contents of a KVS data file while developing your application, or during data forensics.");
 //BA.debugLineNum = 465;BA.debugLine="ChangeStatusBarMessage(\"KSV Viewer 1.0, Copyri";
_changestatusbarmessage("KSV Viewer 1.0, Copyright © 2016, Jim Melanson");
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 474;BA.debugLine="Sub menuBackupKSVFile_Action";
 //BA.debugLineNum = 475;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 476;BA.debugLine="If comboFileField.Items.Get(comboFileField.Selec";
if ((_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())).equals((Object)("")) == false) { 
 //BA.debugLineNum = 477;BA.debugLine="Dim strPath As String";
_strpath = "";
 //BA.debugLineNum = 478;BA.debugLine="Dim strFile As String";
_strfile = "";
 //BA.debugLineNum = 479;BA.debugLine="strPath = File.GetFileParent(comboFileField.Ite";
_strpath = anywheresoftware.b4a.keywords.Common.File.GetFileParent(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 480;BA.debugLine="strFile = File.GetName(comboFileField.Items.Get";
_strfile = anywheresoftware.b4a.keywords.Common.File.GetName(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 481;BA.debugLine="If File.IsDirectory(strPath, strFile) = True Th";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_strpath,_strfile)==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 482;BA.debugLine="dialogue8.WarningDialog(\"File Selection Error\"";
_dialogue8._warningdialog("File Selection Error","No File Selected","You must select a file to import.");
 }else {
 //BA.debugLineNum = 484;BA.debugLine="Dim strTempFileName As String = strFile";
_strtempfilename = _strfile;
 //BA.debugLineNum = 485;BA.debugLine="Dim strExtension As String";
_strextension = "";
 //BA.debugLineNum = 486;BA.debugLine="If strFile.IndexOf(\".\") > 0 Then";
if (_strfile.indexOf(".")>0) { 
 //BA.debugLineNum = 487;BA.debugLine="Dim parts() As String = Regex.Split(\"\\.\", str";
_parts = anywheresoftware.b4a.keywords.Common.Regex.Split("\\.",_strfile);
 //BA.debugLineNum = 488;BA.debugLine="strExtension = parts(parts.Length - 1)";
_strextension = _parts[(int) (_parts.length-1)];
 //BA.debugLineNum = 489;BA.debugLine="If parts.Length > 2 Then";
if (_parts.length>2) { 
 //BA.debugLineNum = 490;BA.debugLine="For i = 0 To parts.Length - 2";
{
final int step16 = 1;
final int limit16 = (int) (_parts.length-2);
for (_i = (int) (0) ; (step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16); _i = ((int)(0 + _i + step16)) ) {
 //BA.debugLineNum = 491;BA.debugLine="strTempFileName = strTempFileName & parts(i";
_strtempfilename = _strtempfilename+_parts[_i];
 }
};
 }else {
 //BA.debugLineNum = 494;BA.debugLine="strTempFileName = parts(0)";
_strtempfilename = _parts[(int) (0)];
 };
 };
 //BA.debugLineNum = 497;BA.debugLine="Dim strUseFileName As String";
_strusefilename = "";
 //BA.debugLineNum = 498;BA.debugLine="For i = 1 To 10000";
{
final int step24 = 1;
final int limit24 = (int) (10000);
for (_i = (int) (1) ; (step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24); _i = ((int)(0 + _i + step24)) ) {
 //BA.debugLineNum = 499;BA.debugLine="If strExtension <> \"\" Then";
if ((_strextension).equals("") == false) { 
 //BA.debugLineNum = 500;BA.debugLine="If File.Exists(strPath, strTempFileName & \"_";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_strpath,_strtempfilename+"_backup_"+BA.NumberToString(_i)+"."+_strextension)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 501;BA.debugLine="strUseFileName = strTempFileName & \"_backup";
_strusefilename = _strtempfilename+"_backup_"+BA.NumberToString(_i)+"."+_strextension;
 //BA.debugLineNum = 502;BA.debugLine="Exit";
if (true) break;
 };
 }else {
 //BA.debugLineNum = 505;BA.debugLine="If File.Exists(strPath, strTempFileName & \"_";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_strpath,_strtempfilename+"_backup_"+BA.NumberToString(_i))==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 506;BA.debugLine="strUseFileName = strTempFileName & \"_backup";
_strusefilename = _strtempfilename+"_backup_"+BA.NumberToString(_i);
 //BA.debugLineNum = 507;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 //BA.debugLineNum = 511;BA.debugLine="If strUseFileName <> \"\" Then";
if ((_strusefilename).equals("") == false) { 
 //BA.debugLineNum = 512;BA.debugLine="File.Copy(strPath, strFile, strPath, strUseFi";
anywheresoftware.b4a.keywords.Common.File.Copy(_strpath,_strfile,_strpath,_strusefilename);
 //BA.debugLineNum = 513;BA.debugLine="DisplayStatusMessage(\"Backup file created.\")";
_displaystatusmessage("Backup file created.");
 //BA.debugLineNum = 514;BA.debugLine="ChangeStatusBarMessage(\"Backup file creadt";
_changestatusbarmessage("Backup file creadted: "+anywheresoftware.b4a.keywords.Common.File.Combine(_strpath,_strusefilename));
 }else {
 //BA.debugLineNum = 516;BA.debugLine="dialogue8.WarningDialog(\"KSV File Backup\", \"B";
_dialogue8._warningdialog("KSV File Backup","Backup Error","The application could not create a backup file. Please do so manually.");
 //BA.debugLineNum = 517;BA.debugLine="DisplayStatusMessage(\"Backup Failed.\")";
_displaystatusmessage("Backup Failed.");
 //BA.debugLineNum = 518;BA.debugLine="ChangeStatusBarMessage(\"Backu process failed.";
_changestatusbarmessage("Backu process failed. There are too many backup copies. Please backup the file manually, or remove some of your previous backups.");
 };
 };
 };
 };
 //BA.debugLineNum = 523;BA.debugLine="End Sub";
return "";
}
public static String  _menucleardata_action() throws Exception{
 //BA.debugLineNum = 447;BA.debugLine="Sub menuClearData_Action";
 //BA.debugLineNum = 448;BA.debugLine="tableDataView.Items.Clear";
_tabledataview.getItems().Clear();
 //BA.debugLineNum = 449;BA.debugLine="If kvs.IsInitialized = True Then";
if (_kvs.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 450;BA.debugLine="kvs.Close";
_kvs._close();
 };
 //BA.debugLineNum = 452;BA.debugLine="ChangeStatusBarMessage(\"Contents cleared.\")";
_changestatusbarmessage("Contents cleared.");
 //BA.debugLineNum = 453;BA.debugLine="MenuDisableItems";
_menudisableitems();
 //BA.debugLineNum = 454;BA.debugLine="End Sub";
return "";
}
public static String  _menuclearrecentitems_action() throws Exception{
 //BA.debugLineNum = 456;BA.debugLine="Sub menuClearRecentItems_Action";
 //BA.debugLineNum = 457;BA.debugLine="ClearRecentItemsList";
_clearrecentitemslist();
 //BA.debugLineNum = 458;BA.debugLine="DisplayStatusMessage(\"Recent items deleted.\")";
_displaystatusmessage("Recent items deleted.");
 //BA.debugLineNum = 459;BA.debugLine="ChangeStatusBarMessage(\"The recent items list has";
_changestatusbarmessage("The recent items list has been deleted.");
 //BA.debugLineNum = 460;BA.debugLine="End Sub";
return "";
}
public static String  _menucopytablecell_action() throws Exception{
String _strcellcontent = "";
 //BA.debugLineNum = 399;BA.debugLine="Sub menuCopyTableCell_Action";
 //BA.debugLineNum = 400;BA.debugLine="If tableDataView.SelectedRow >= 0 Then";
if (_tabledataview.getSelectedRow()>=0) { 
 //BA.debugLineNum = 401;BA.debugLine="Dim strCellContent As String = tableviewCell";
_strcellcontent = BA.ObjectToString(_tableviewcell);
 //BA.debugLineNum = 402;BA.debugLine="fx.Clipboard.SetString(strCellContent)";
_fx.Clipboard.SetString(_strcellcontent);
 //BA.debugLineNum = 403;BA.debugLine="ChangeStatusBarMessage(\"Cell contents copied to";
_changestatusbarmessage("Cell contents copied to clipboard.");
 };
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return "";
}
public static String  _menudisableitems() throws Exception{
anywheresoftware.b4a.objects.collections.List _listenable = null;
int _i = 0;
int _i2 = 0;
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
anywheresoftware.b4a.objects.collections.List _listcontextenable = null;
 //BA.debugLineNum = 319;BA.debugLine="Sub MenuDisableItems";
 //BA.debugLineNum = 320;BA.debugLine="Dim listEnable As List";
_listenable = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 321;BA.debugLine="listEnable.Initialize";
_listenable.Initialize();
 //BA.debugLineNum = 322;BA.debugLine="listEnable.Add(\"mnuSynch\")";
_listenable.Add((Object)("mnuSynch"));
 //BA.debugLineNum = 323;BA.debugLine="listEnable.Add(\"mnuClear\")";
_listenable.Add((Object)("mnuClear"));
 //BA.debugLineNum = 324;BA.debugLine="listEnable.Add(\"mnuBackup\")";
_listenable.Add((Object)("mnuBackup"));
 //BA.debugLineNum = 325;BA.debugLine="listEnable.Add(\"mnuExport\")";
_listenable.Add((Object)("mnuExport"));
 //BA.debugLineNum = 326;BA.debugLine="listEnable.Add(\"mnuTableCopy\")";
_listenable.Add((Object)("mnuTableCopy"));
 //BA.debugLineNum = 327;BA.debugLine="listEnable.Add(\"mnuTableHide\")";
_listenable.Add((Object)("mnuTableHide"));
 //BA.debugLineNum = 328;BA.debugLine="listEnable.Add(\"mnuTableEdit\")";
_listenable.Add((Object)("mnuTableEdit"));
 //BA.debugLineNum = 329;BA.debugLine="listEnable.Add(\"menuKVSDeleteRecord\")";
_listenable.Add((Object)("menuKVSDeleteRecord"));
 //BA.debugLineNum = 330;BA.debugLine="For i = 0 To mapMenus.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_mapmenus.getSize()-1);
for (_i = (int) (0) ; (step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11); _i = ((int)(0 + _i + step11)) ) {
 //BA.debugLineNum = 331;BA.debugLine="For i2 = 0 To listEnable.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_listenable.getSize()-1);
for (_i2 = (int) (0) ; (step12 > 0 && _i2 <= limit12) || (step12 < 0 && _i2 >= limit12); _i2 = ((int)(0 + _i2 + step12)) ) {
 //BA.debugLineNum = 332;BA.debugLine="If mapMenus.GetKeyAt(i) = listEnable.Get(i2) Th";
if ((_mapmenus.GetKeyAt(_i)).equals(_listenable.Get(_i2))) { 
 //BA.debugLineNum = 333;BA.debugLine="Dim mi As MenuItem = mapMenus.Get(listEnable.G";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapmenus.Get(_listenable.Get(_i2))));
 //BA.debugLineNum = 334;BA.debugLine="mi.Enabled = False";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 335;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 //BA.debugLineNum = 339;BA.debugLine="Dim listContextEnable As List";
_listcontextenable = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 340;BA.debugLine="listContextEnable.Initialize";
_listcontextenable.Initialize();
 //BA.debugLineNum = 341;BA.debugLine="listContextEnable.Add(\"mnuTableCopy\")";
_listcontextenable.Add((Object)("mnuTableCopy"));
 //BA.debugLineNum = 342;BA.debugLine="listContextEnable.Add(\"mnuTableHide\")";
_listcontextenable.Add((Object)("mnuTableHide"));
 //BA.debugLineNum = 343;BA.debugLine="listContextEnable.Add(\"mnuTableEdit\")";
_listcontextenable.Add((Object)("mnuTableEdit"));
 //BA.debugLineNum = 344;BA.debugLine="listContextEnable.Add(\"mnuTableDelete\")";
_listcontextenable.Add((Object)("mnuTableDelete"));
 //BA.debugLineNum = 345;BA.debugLine="For i = 0 To mapContextMenus.Size - 1";
{
final int step26 = 1;
final int limit26 = (int) (_mapcontextmenus.getSize()-1);
for (_i = (int) (0) ; (step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26); _i = ((int)(0 + _i + step26)) ) {
 //BA.debugLineNum = 346;BA.debugLine="For i2 = 0 To listContextEnable.Size - 1";
{
final int step27 = 1;
final int limit27 = (int) (_listcontextenable.getSize()-1);
for (_i2 = (int) (0) ; (step27 > 0 && _i2 <= limit27) || (step27 < 0 && _i2 >= limit27); _i2 = ((int)(0 + _i2 + step27)) ) {
 //BA.debugLineNum = 347;BA.debugLine="If mapContextMenus.GetKeyAt(i) = listContextEna";
if ((_mapcontextmenus.GetKeyAt(_i)).equals(_listcontextenable.Get(_i2))) { 
 //BA.debugLineNum = 348;BA.debugLine="Dim mi As MenuItem = mapContextMenus.Get(listC";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapcontextmenus.Get(_listcontextenable.Get(_i2))));
 //BA.debugLineNum = 349;BA.debugLine="mi.Enabled = False";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 350;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 //BA.debugLineNum = 354;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return "";
}
public static String  _menueditrecord_action() throws Exception{
Object[] _row = null;
 //BA.debugLineNum = 431;BA.debugLine="Sub menuEditRecord_Action";
 //BA.debugLineNum = 432;BA.debugLine="If tableDataView.SelectedRow >= 0 Then";
if (_tabledataview.getSelectedRow()>=0) { 
 //BA.debugLineNum = 433;BA.debugLine="Dim Row() As Object = tableDataView.Items.Get(ta";
_row = (Object[])(_tabledataview.getItems().Get(_tabledataview.getSelectedRow()));
 //BA.debugLineNum = 434;BA.debugLine="txtAddEditKeyname.Text = Row(0)";
_txtaddeditkeyname.setText(BA.ObjectToString(_row[(int) (0)]));
 //BA.debugLineNum = 435;BA.debugLine="txtAddEditValue.Text = Row(1)";
_txtaddeditvalue.setText(BA.ObjectToString(_row[(int) (1)]));
 };
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return "";
}
public static String  _menuenableitems() throws Exception{
anywheresoftware.b4a.objects.collections.List _listenable = null;
int _i = 0;
int _i2 = 0;
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
anywheresoftware.b4a.objects.collections.List _listcontextenable = null;
 //BA.debugLineNum = 357;BA.debugLine="Sub MenuEnableItems";
 //BA.debugLineNum = 358;BA.debugLine="Dim listEnable As List";
_listenable = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 359;BA.debugLine="listEnable.Initialize";
_listenable.Initialize();
 //BA.debugLineNum = 360;BA.debugLine="listEnable.Add(\"mnuSynch\")";
_listenable.Add((Object)("mnuSynch"));
 //BA.debugLineNum = 361;BA.debugLine="listEnable.Add(\"mnuClear\")";
_listenable.Add((Object)("mnuClear"));
 //BA.debugLineNum = 362;BA.debugLine="listEnable.Add(\"mnuBackup\")";
_listenable.Add((Object)("mnuBackup"));
 //BA.debugLineNum = 363;BA.debugLine="listEnable.Add(\"mnuExport\")";
_listenable.Add((Object)("mnuExport"));
 //BA.debugLineNum = 364;BA.debugLine="listEnable.Add(\"mnuTableCopy\")";
_listenable.Add((Object)("mnuTableCopy"));
 //BA.debugLineNum = 365;BA.debugLine="listEnable.Add(\"mnuTableHide\")";
_listenable.Add((Object)("mnuTableHide"));
 //BA.debugLineNum = 366;BA.debugLine="listEnable.Add(\"mnuTableEdit\")";
_listenable.Add((Object)("mnuTableEdit"));
 //BA.debugLineNum = 367;BA.debugLine="listEnable.Add(\"menuKVSDeleteRecord\")";
_listenable.Add((Object)("menuKVSDeleteRecord"));
 //BA.debugLineNum = 368;BA.debugLine="For i = 0 To mapMenus.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_mapmenus.getSize()-1);
for (_i = (int) (0) ; (step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11); _i = ((int)(0 + _i + step11)) ) {
 //BA.debugLineNum = 369;BA.debugLine="For i2 = 0 To listEnable.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_listenable.getSize()-1);
for (_i2 = (int) (0) ; (step12 > 0 && _i2 <= limit12) || (step12 < 0 && _i2 >= limit12); _i2 = ((int)(0 + _i2 + step12)) ) {
 //BA.debugLineNum = 370;BA.debugLine="If mapMenus.GetKeyAt(i) = listEnable.Get(i2) Th";
if ((_mapmenus.GetKeyAt(_i)).equals(_listenable.Get(_i2))) { 
 //BA.debugLineNum = 371;BA.debugLine="Dim mi As MenuItem = mapMenus.Get(listEnable.G";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapmenus.Get(_listenable.Get(_i2))));
 //BA.debugLineNum = 372;BA.debugLine="mi.Enabled = True";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 373;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 //BA.debugLineNum = 377;BA.debugLine="Dim listContextEnable As List";
_listcontextenable = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 378;BA.debugLine="listContextEnable.Initialize";
_listcontextenable.Initialize();
 //BA.debugLineNum = 379;BA.debugLine="listContextEnable.Add(\"mnuTableCopy\")";
_listcontextenable.Add((Object)("mnuTableCopy"));
 //BA.debugLineNum = 380;BA.debugLine="listContextEnable.Add(\"mnuTableHide\")";
_listcontextenable.Add((Object)("mnuTableHide"));
 //BA.debugLineNum = 381;BA.debugLine="listContextEnable.Add(\"mnuTableEdit\")";
_listcontextenable.Add((Object)("mnuTableEdit"));
 //BA.debugLineNum = 382;BA.debugLine="listContextEnable.Add(\"mnuTableDelete\")";
_listcontextenable.Add((Object)("mnuTableDelete"));
 //BA.debugLineNum = 383;BA.debugLine="For i = 0 To mapContextMenus.Size - 1";
{
final int step26 = 1;
final int limit26 = (int) (_mapcontextmenus.getSize()-1);
for (_i = (int) (0) ; (step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26); _i = ((int)(0 + _i + step26)) ) {
 //BA.debugLineNum = 384;BA.debugLine="For i2 = 0 To listContextEnable.Size - 1";
{
final int step27 = 1;
final int limit27 = (int) (_listcontextenable.getSize()-1);
for (_i2 = (int) (0) ; (step27 > 0 && _i2 <= limit27) || (step27 < 0 && _i2 >= limit27); _i2 = ((int)(0 + _i2 + step27)) ) {
 //BA.debugLineNum = 385;BA.debugLine="If mapContextMenus.GetKeyAt(i) = listContextEna";
if ((_mapcontextmenus.GetKeyAt(_i)).equals(_listcontextenable.Get(_i2))) { 
 //BA.debugLineNum = 386;BA.debugLine="Dim mi As MenuItem = mapContextMenus.Get(listC";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapcontextmenus.Get(_listcontextenable.Get(_i2))));
 //BA.debugLineNum = 387;BA.debugLine="mi.Enabled = True";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 388;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 //BA.debugLineNum = 392;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return "";
}
public static String  _menuexit_action() throws Exception{
 //BA.debugLineNum = 443;BA.debugLine="Sub menuExit_Action";
 //BA.debugLineNum = 444;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 525;BA.debugLine="Sub menuExportToCSV_Action";
 //BA.debugLineNum = 526;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 527;BA.debugLine="If tableDataView.Items.Size > 0 Then";
if (_tabledataview.getItems().getSize()>0) { 
 //BA.debugLineNum = 528;BA.debugLine="Dim listWrite As List";
_listwrite = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 529;BA.debugLine="listWrite.Initialize";
_listwrite.Initialize();
 //BA.debugLineNum = 530;BA.debugLine="Dim boolIsData As Boolean = False";
_boolisdata = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 531;BA.debugLine="Dim strRecord As String";
_strrecord = "";
 //BA.debugLineNum = 532;BA.debugLine="strRecord = QUOTE & \"Key Name\" & QUOTE & \",\" &";
_strrecord = anywheresoftware.b4a.keywords.Common.QUOTE+"Key Name"+anywheresoftware.b4a.keywords.Common.QUOTE+","+anywheresoftware.b4a.keywords.Common.QUOTE+"Value"+anywheresoftware.b4a.keywords.Common.QUOTE;
 //BA.debugLineNum = 533;BA.debugLine="listWrite.Add(strRecord)";
_listwrite.Add((Object)(_strrecord));
 //BA.debugLineNum = 534;BA.debugLine="For i = 0 To tableDataView.Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_tabledataview.getItems().getSize()-1);
for (_i = (int) (0) ; (step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9); _i = ((int)(0 + _i + step9)) ) {
 //BA.debugLineNum = 535;BA.debugLine="Dim Row() As Object = tableDataView.Items.Get(";
_row = (Object[])(_tabledataview.getItems().Get(_i));
 //BA.debugLineNum = 536;BA.debugLine="Dim strThisKey As String = Row(0)";
_strthiskey = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 537;BA.debugLine="strThisKey.Replace(QUOTE, QUOTE & QUOTE)";
_strthiskey.replace(anywheresoftware.b4a.keywords.Common.QUOTE,anywheresoftware.b4a.keywords.Common.QUOTE+anywheresoftware.b4a.keywords.Common.QUOTE);
 //BA.debugLineNum = 538;BA.debugLine="Dim strThisValue As String = Row(1)";
_strthisvalue = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 539;BA.debugLine="strThisValue.Replace(QUOTE, QUOTE & QUOTE)";
_strthisvalue.replace(anywheresoftware.b4a.keywords.Common.QUOTE,anywheresoftware.b4a.keywords.Common.QUOTE+anywheresoftware.b4a.keywords.Common.QUOTE);
 //BA.debugLineNum = 540;BA.debugLine="strRecord = QUOTE & strThisKey & QUOTE & \",\" &";
_strrecord = anywheresoftware.b4a.keywords.Common.QUOTE+_strthiskey+anywheresoftware.b4a.keywords.Common.QUOTE+","+anywheresoftware.b4a.keywords.Common.QUOTE+_strthisvalue+anywheresoftware.b4a.keywords.Common.QUOTE;
 //BA.debugLineNum = 541;BA.debugLine="listWrite.Add(strRecord)";
_listwrite.Add((Object)(_strrecord));
 //BA.debugLineNum = 542;BA.debugLine="boolIsData = True";
_boolisdata = anywheresoftware.b4a.keywords.Common.True;
 }
};
 //BA.debugLineNum = 544;BA.debugLine="If boolIsData = True Then";
if (_boolisdata==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 545;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 546;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 547;BA.debugLine="If strExistingFilePath.Length > 0 Then";
if (_strexistingfilepath.length()>0) { 
 //BA.debugLineNum = 548;BA.debugLine="fc.InitialDirectory = strExistingFilePath";
_fc.setInitialDirectory(_strexistingfilepath);
 }else {
 //BA.debugLineNum = 550;BA.debugLine="fc.InitialDirectory = GetDataFolder(\"KVSViewe";
_fc.setInitialDirectory(_getdatafolder("KVSViewer"));
 };
 //BA.debugLineNum = 552;BA.debugLine="fc.InitialFileName = SuggestProfileNameForPrin";
_fc.setInitialFileName(_suggestprofilenameforprintsaveexport("csv"));
 //BA.debugLineNum = 553;BA.debugLine="fc.Title = \"Save CSV File\"";
_fc.setTitle("Save CSV File");
 //BA.debugLineNum = 554;BA.debugLine="Dim strSaveAs As String";
_strsaveas = "";
 //BA.debugLineNum = 555;BA.debugLine="strSaveAs = fc.Showsave(MainForm)";
_strsaveas = _fc.ShowSave(_mainform);
 //BA.debugLineNum = 557;BA.debugLine="If strSaveAs.Length = 0 Then Return";
if (_strsaveas.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 558;BA.debugLine="Dim fileO As JavaObject";
_fileo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 559;BA.debugLine="fileO.InitializeNewInstance(\"java.io.File\",";
_fileo.InitializeNewInstance("java.io.File",new Object[]{(Object)(_strsaveas)});
 //BA.debugLineNum = 560;BA.debugLine="Dim fileName As String";
_filename = "";
 //BA.debugLineNum = 561;BA.debugLine="Dim filePath As String";
_filepath = "";
 //BA.debugLineNum = 562;BA.debugLine="fileName = fileO.RunMethod(\"getName\", Null)";
_filename = BA.ObjectToString(_fileo.RunMethod("getName",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 563;BA.debugLine="filePath = fileO.RunMethod(\"getPath\", Null)";
_filepath = BA.ObjectToString(_fileo.RunMethod("getPath",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 564;BA.debugLine="filePath = filePath.Replace(fileName, \"\")";
_filepath = _filepath.replace(_filename,"");
 //BA.debugLineNum = 565;BA.debugLine="strExistingFilePath = filePath";
_strexistingfilepath = _filepath;
 //BA.debugLineNum = 566;BA.debugLine="File.WriteList(filePath, fileName, listWrite)";
anywheresoftware.b4a.keywords.Common.File.WriteList(_filepath,_filename,_listwrite);
 //BA.debugLineNum = 567;BA.debugLine="DisplayStatusMessage(File.Combine(filePath, fi";
_displaystatusmessage(anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 //BA.debugLineNum = 568;BA.debugLine="fx.ShowExternalDocument(File.GetUri(filePath,";
_fx.ShowExternalDocument(anywheresoftware.b4a.keywords.Common.File.GetUri(_filepath,_filename));
 //BA.debugLineNum = 569;BA.debugLine="ChangeStatusBarMessage(\"The displayed contents";
_changestatusbarmessage("The displayed contents have been exported as a CSV file: "+anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 };
 };
 };
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 662;BA.debugLine="Sub menuExportToJSON_Action";
 //BA.debugLineNum = 663;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 664;BA.debugLine="If tableDataView.Items.Size > 0 Then";
if (_tabledataview.getItems().getSize()>0) { 
 //BA.debugLineNum = 665;BA.debugLine="Dim mapJson As Map";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 666;BA.debugLine="mapJson.Initialize";
_mapjson.Initialize();
 //BA.debugLineNum = 667;BA.debugLine="Dim boolIsData As Boolean = False";
_boolisdata = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 668;BA.debugLine="For i = 0 To tableDataView.Items.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_tabledataview.getItems().getSize()-1);
for (_i = (int) (0) ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
 //BA.debugLineNum = 669;BA.debugLine="Dim Row() As Object = tableDataView.Items.Get(";
_row = (Object[])(_tabledataview.getItems().Get(_i));
 //BA.debugLineNum = 670;BA.debugLine="mapJson.Put(Row(0), Row(1))";
_mapjson.Put(_row[(int) (0)],_row[(int) (1)]);
 //BA.debugLineNum = 671;BA.debugLine="boolIsData = True";
_boolisdata = anywheresoftware.b4a.keywords.Common.True;
 }
};
 //BA.debugLineNum = 673;BA.debugLine="If boolIsData = True Then";
if (_boolisdata==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 674;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 675;BA.debugLine="Dim Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 676;BA.debugLine="Data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 677;BA.debugLine="Data.Add(mapJson)";
_data.Add((Object)(_mapjson.getObject()));
 //BA.debugLineNum = 678;BA.debugLine="JSONGenerator.Initialize2(Data)";
_jsongenerator.Initialize2(_data);
 //BA.debugLineNum = 679;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 680;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 681;BA.debugLine="If strExistingFilePath.Length > 0 Then";
if (_strexistingfilepath.length()>0) { 
 //BA.debugLineNum = 682;BA.debugLine="fc.InitialDirectory = strExistingFilePath";
_fc.setInitialDirectory(_strexistingfilepath);
 }else {
 //BA.debugLineNum = 684;BA.debugLine="fc.InitialDirectory = GetDataFolder(\"KVSViewe";
_fc.setInitialDirectory(_getdatafolder("KVSViewer"));
 };
 //BA.debugLineNum = 686;BA.debugLine="fc.InitialFileName = SuggestProfileNameForPrin";
_fc.setInitialFileName(_suggestprofilenameforprintsaveexport("json"));
 //BA.debugLineNum = 687;BA.debugLine="fc.Title = \"Save CSV File\"";
_fc.setTitle("Save CSV File");
 //BA.debugLineNum = 688;BA.debugLine="Dim strSaveAs As String";
_strsaveas = "";
 //BA.debugLineNum = 689;BA.debugLine="strSaveAs = fc.Showsave(MainForm)";
_strsaveas = _fc.ShowSave(_mainform);
 //BA.debugLineNum = 691;BA.debugLine="If strSaveAs.Length = 0 Then Return";
if (_strsaveas.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 692;BA.debugLine="Dim fileO As JavaObject";
_fileo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 693;BA.debugLine="fileO.InitializeNewInstance(\"java.io.File\",";
_fileo.InitializeNewInstance("java.io.File",new Object[]{(Object)(_strsaveas)});
 //BA.debugLineNum = 694;BA.debugLine="Dim fileName As String";
_filename = "";
 //BA.debugLineNum = 695;BA.debugLine="Dim filePath As String";
_filepath = "";
 //BA.debugLineNum = 696;BA.debugLine="fileName = fileO.RunMethod(\"getName\", Null)";
_filename = BA.ObjectToString(_fileo.RunMethod("getName",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 697;BA.debugLine="filePath = fileO.RunMethod(\"getPath\", Null)";
_filepath = BA.ObjectToString(_fileo.RunMethod("getPath",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 698;BA.debugLine="filePath = filePath.Replace(fileName, \"\")";
_filepath = _filepath.replace(_filename,"");
 //BA.debugLineNum = 699;BA.debugLine="strExistingFilePath = filePath";
_strexistingfilepath = _filepath;
 //BA.debugLineNum = 700;BA.debugLine="File.WriteString(filePath, fileName, JSONGener";
anywheresoftware.b4a.keywords.Common.File.WriteString(_filepath,_filename,_jsongenerator.ToPrettyString((int) (2)));
 //BA.debugLineNum = 701;BA.debugLine="dialogue8.InformationDialog(\"Export Confirmati";
_dialogue8._informationdialog("Export Confirmation","JSON File Created","You will find the file here:"+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 //BA.debugLineNum = 702;BA.debugLine="ChangeStatusBarMessage(\"The displayed contents";
_changestatusbarmessage("The displayed contents have been exported as a JSON file: "+anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 };
 };
 };
 //BA.debugLineNum = 706;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 575;BA.debugLine="Sub menuExportToText_Action";
 //BA.debugLineNum = 576;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 577;BA.debugLine="If tableDataView.Items.Size > 0 Then";
if (_tabledataview.getItems().getSize()>0) { 
 //BA.debugLineNum = 578;BA.debugLine="Dim listWrite As List";
_listwrite = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 579;BA.debugLine="listWrite.Initialize";
_listwrite.Initialize();
 //BA.debugLineNum = 580;BA.debugLine="Dim boolIsData As Boolean = False";
_boolisdata = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 581;BA.debugLine="Dim strRecord As String";
_strrecord = "";
 //BA.debugLineNum = 582;BA.debugLine="For i = 0 To tableDataView.Items.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_tabledataview.getItems().getSize()-1);
for (_i = (int) (0) ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
 //BA.debugLineNum = 583;BA.debugLine="Dim Row() As Object = tableDataView.Items.Get(";
_row = (Object[])(_tabledataview.getItems().Get(_i));
 //BA.debugLineNum = 584;BA.debugLine="strRecord = Row(0) & TAB & \"=>\" & TAB & Row(1)";
_strrecord = BA.ObjectToString(_row[(int) (0)])+anywheresoftware.b4a.keywords.Common.TAB+"=>"+anywheresoftware.b4a.keywords.Common.TAB+BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 585;BA.debugLine="listWrite.Add(strRecord)";
_listwrite.Add((Object)(_strrecord));
 //BA.debugLineNum = 586;BA.debugLine="boolIsData = True";
_boolisdata = anywheresoftware.b4a.keywords.Common.True;
 }
};
 //BA.debugLineNum = 588;BA.debugLine="If boolIsData = True Then";
if (_boolisdata==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 589;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 590;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 591;BA.debugLine="If strExistingFilePath.Length > 0 Then";
if (_strexistingfilepath.length()>0) { 
 //BA.debugLineNum = 592;BA.debugLine="fc.InitialDirectory = strExistingFilePath";
_fc.setInitialDirectory(_strexistingfilepath);
 }else {
 //BA.debugLineNum = 594;BA.debugLine="fc.InitialDirectory = GetDataFolder(\"KVSViewe";
_fc.setInitialDirectory(_getdatafolder("KVSViewer"));
 };
 //BA.debugLineNum = 596;BA.debugLine="fc.InitialFileName = SuggestProfileNameForPrin";
_fc.setInitialFileName(_suggestprofilenameforprintsaveexport("txt"));
 //BA.debugLineNum = 597;BA.debugLine="fc.Title = \"Save CSV File\"";
_fc.setTitle("Save CSV File");
 //BA.debugLineNum = 598;BA.debugLine="Dim strSaveAs As String";
_strsaveas = "";
 //BA.debugLineNum = 599;BA.debugLine="strSaveAs = fc.Showsave(MainForm)";
_strsaveas = _fc.ShowSave(_mainform);
 //BA.debugLineNum = 601;BA.debugLine="If strSaveAs.Length = 0 Then Return";
if (_strsaveas.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 602;BA.debugLine="Dim fileO As JavaObject";
_fileo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 603;BA.debugLine="fileO.InitializeNewInstance(\"java.io.File\",";
_fileo.InitializeNewInstance("java.io.File",new Object[]{(Object)(_strsaveas)});
 //BA.debugLineNum = 604;BA.debugLine="Dim fileName As String";
_filename = "";
 //BA.debugLineNum = 605;BA.debugLine="Dim filePath As String";
_filepath = "";
 //BA.debugLineNum = 606;BA.debugLine="fileName = fileO.RunMethod(\"getName\", Null)";
_filename = BA.ObjectToString(_fileo.RunMethod("getName",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 607;BA.debugLine="filePath = fileO.RunMethod(\"getPath\", Null)";
_filepath = BA.ObjectToString(_fileo.RunMethod("getPath",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 608;BA.debugLine="filePath = filePath.Replace(fileName, \"\")";
_filepath = _filepath.replace(_filename,"");
 //BA.debugLineNum = 609;BA.debugLine="strExistingFilePath = filePath";
_strexistingfilepath = _filepath;
 //BA.debugLineNum = 610;BA.debugLine="File.WriteList(filePath, fileName, listWrite)";
anywheresoftware.b4a.keywords.Common.File.WriteList(_filepath,_filename,_listwrite);
 //BA.debugLineNum = 611;BA.debugLine="DisplayStatusMessage(File.Combine(filePath, fi";
_displaystatusmessage(anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 //BA.debugLineNum = 612;BA.debugLine="fx.ShowExternalDocument(File.GetUri(filePath,";
_fx.ShowExternalDocument(anywheresoftware.b4a.keywords.Common.File.GetUri(_filepath,_filename));
 //BA.debugLineNum = 613;BA.debugLine="ChangeStatusBarMessage(\"The displayed contents";
_changestatusbarmessage("The displayed contents have been exported as a TEXT file: "+anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 };
 };
 };
 //BA.debugLineNum = 617;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 619;BA.debugLine="Sub menuExportToXML_Action";
 //BA.debugLineNum = 620;BA.debugLine="If comboFileField.SelectedIndex > -1 Then";
if (_combofilefield.getSelectedIndex()>-1) { 
 //BA.debugLineNum = 621;BA.debugLine="If tableDataView.Items.Size > 0 Then";
if (_tabledataview.getItems().getSize()>0) { 
 //BA.debugLineNum = 622;BA.debugLine="Dim boolIsData As Boolean";
_boolisdata = false;
 //BA.debugLineNum = 623;BA.debugLine="Dim strXMLContent As String";
_strxmlcontent = "";
 //BA.debugLineNum = 624;BA.debugLine="strXMLContent = \"<?xml version=\" & QUOTE & \"1.0";
_strxmlcontent = "<?xml version="+anywheresoftware.b4a.keywords.Common.QUOTE+"1.0"+anywheresoftware.b4a.keywords.Common.QUOTE+"?>"+anywheresoftware.b4a.keywords.Common.CRLF+"<kvs url="+anywheresoftware.b4a.keywords.Common.QUOTE+BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex()))+anywheresoftware.b4a.keywords.Common.QUOTE+" modified="+anywheresoftware.b4a.keywords.Common.QUOTE+anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.File.LastModified(anywheresoftware.b4a.keywords.Common.File.GetFileParent(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex()))),anywheresoftware.b4a.keywords.Common.File.GetName(BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())))))+anywheresoftware.b4a.keywords.Common.QUOTE+" xmlgenerated="+anywheresoftware.b4a.keywords.Common.QUOTE+anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow())+anywheresoftware.b4a.keywords.Common.QUOTE+" encoding="+anywheresoftware.b4a.keywords.Common.QUOTE+"UTF-8"+anywheresoftware.b4a.keywords.Common.QUOTE+">"+anywheresoftware.b4a.keywords.Common.CRLF;
 //BA.debugLineNum = 625;BA.debugLine="For i = 0 To tableDataView.Items.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_tabledataview.getItems().getSize()-1);
for (_i = (int) (0) ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
 //BA.debugLineNum = 626;BA.debugLine="Dim Row() As Object = tableDataView.Items.Get(";
_row = (Object[])(_tabledataview.getItems().Get(_i));
 //BA.debugLineNum = 627;BA.debugLine="strXMLContent = strXMLContent & \"  <record>\" &";
_strxmlcontent = _strxmlcontent+"  <record>"+anywheresoftware.b4a.keywords.Common.CRLF+"    <key>"+BA.ObjectToString(_row[(int) (0)])+"</key>"+anywheresoftware.b4a.keywords.Common.CRLF+"    <value>"+BA.ObjectToString(_row[(int) (1)])+"</value>"+anywheresoftware.b4a.keywords.Common.CRLF+"  </record>"+anywheresoftware.b4a.keywords.Common.CRLF;
 //BA.debugLineNum = 628;BA.debugLine="boolIsData = True";
_boolisdata = anywheresoftware.b4a.keywords.Common.True;
 }
};
 //BA.debugLineNum = 630;BA.debugLine="strXMLContent = strXMLContent & \"</kvs>\" & CRLF";
_strxmlcontent = _strxmlcontent+"</kvs>"+anywheresoftware.b4a.keywords.Common.CRLF;
 //BA.debugLineNum = 631;BA.debugLine="If boolIsData = True Then";
if (_boolisdata==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 632;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 633;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 634;BA.debugLine="If strExistingFilePath.Length > 0 Then";
if (_strexistingfilepath.length()>0) { 
 //BA.debugLineNum = 635;BA.debugLine="fc.InitialDirectory = strExistingFilePath";
_fc.setInitialDirectory(_strexistingfilepath);
 }else {
 //BA.debugLineNum = 637;BA.debugLine="fc.InitialDirectory = GetDataFolder(\"KVSViewe";
_fc.setInitialDirectory(_getdatafolder("KVSViewer"));
 };
 //BA.debugLineNum = 639;BA.debugLine="fc.InitialFileName = SuggestProfileNameForPrin";
_fc.setInitialFileName(_suggestprofilenameforprintsaveexport("xml"));
 //BA.debugLineNum = 640;BA.debugLine="fc.Title = \"Save CSV File\"";
_fc.setTitle("Save CSV File");
 //BA.debugLineNum = 641;BA.debugLine="Dim strSaveAs As String";
_strsaveas = "";
 //BA.debugLineNum = 642;BA.debugLine="strSaveAs = fc.Showsave(MainForm)";
_strsaveas = _fc.ShowSave(_mainform);
 //BA.debugLineNum = 644;BA.debugLine="If strSaveAs.Length = 0 Then Return";
if (_strsaveas.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 645;BA.debugLine="Dim fileO As JavaObject";
_fileo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 646;BA.debugLine="fileO.InitializeNewInstance(\"java.io.File\",";
_fileo.InitializeNewInstance("java.io.File",new Object[]{(Object)(_strsaveas)});
 //BA.debugLineNum = 647;BA.debugLine="Dim fileName As String";
_filename = "";
 //BA.debugLineNum = 648;BA.debugLine="Dim filePath As String";
_filepath = "";
 //BA.debugLineNum = 649;BA.debugLine="fileName = fileO.RunMethod(\"getName\", Null)";
_filename = BA.ObjectToString(_fileo.RunMethod("getName",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 650;BA.debugLine="filePath = fileO.RunMethod(\"getPath\", Null)";
_filepath = BA.ObjectToString(_fileo.RunMethod("getPath",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 651;BA.debugLine="filePath = filePath.Replace(fileName, \"\")";
_filepath = _filepath.replace(_filename,"");
 //BA.debugLineNum = 652;BA.debugLine="strExistingFilePath = filePath";
_strexistingfilepath = _filepath;
 //BA.debugLineNum = 653;BA.debugLine="File.WriteString(filePath, fileName, strXMLCon";
anywheresoftware.b4a.keywords.Common.File.WriteString(_filepath,_filename,_strxmlcontent);
 //BA.debugLineNum = 654;BA.debugLine="fx.ShowExternalDocument(File.GetUri(filePath,";
_fx.ShowExternalDocument(anywheresoftware.b4a.keywords.Common.File.GetUri(_filepath,_filename));
 //BA.debugLineNum = 655;BA.debugLine="DisplayStatusMessage(File.Combine(filePath, fi";
_displaystatusmessage(anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 //BA.debugLineNum = 656;BA.debugLine="ChangeStatusBarMessage(\"The displayed contents";
_changestatusbarmessage("The displayed contents have been exported as an XML file: "+anywheresoftware.b4a.keywords.Common.File.Combine(_filepath,_filename));
 };
 };
 };
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
return "";
}
public static String  _menuhelp_action() throws Exception{
String _strhtml = "";
 //BA.debugLineNum = 468;BA.debugLine="Sub menuHelp_Action";
 //BA.debugLineNum = 469;BA.debugLine="Dim strHtml As String";
_strhtml = "";
 //BA.debugLineNum = 470;BA.debugLine="strHtml = File.ReadString(File.DirAssets, \"help";
_strhtml = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"help.html");
 //BA.debugLineNum = 471;BA.debugLine="dialogue8.MessageHTMLDialog(\"KVS Viewer Help Fi";
_dialogue8._messagehtmldialog("KVS Viewer Help File",_strhtml);
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return "";
}
public static String  _menuhidetablerow_action() throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Sub menuHideTableRow_Action";
 //BA.debugLineNum = 408;BA.debugLine="If tableDataView.SelectedRow >= 0 Then";
if (_tabledataview.getSelectedRow()>=0) { 
 //BA.debugLineNum = 409;BA.debugLine="tableDataView.Items.RemoveAt(tableDataView.Selec";
_tabledataview.getItems().RemoveAt(_tabledataview.getSelectedRow());
 //BA.debugLineNum = 410;BA.debugLine="DisplayStatusMessage(\"Click RELOAD to see the it";
_displaystatusmessage("Click RELOAD to see the item again.");
 //BA.debugLineNum = 411;BA.debugLine="ChangeStatusBarMessage(\"The selected row has bee";
_changestatusbarmessage("The selected row has been hidden, but not deleted from the KSV file. To see the row again, click the Reload button.");
 };
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return "";
}
public static String  _menukvsdeleterecord_action() throws Exception{
Object[] _row = null;
String _strkeyname = "";
 //BA.debugLineNum = 415;BA.debugLine="Sub menuKVSDeleteRecord_Action";
 //BA.debugLineNum = 416;BA.debugLine="If tableDataView.SelectedRow >= 0 Then";
if (_tabledataview.getSelectedRow()>=0) { 
 //BA.debugLineNum = 417;BA.debugLine="If dialogue8.ConfirmationDialog(\"Key Value Store";
if (_dialogue8._confirmationdialog("Key Value Store","Live File Modification Confirmation","Do you really want to DELETE the selected key/value pair from the LIVE file?")==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 418;BA.debugLine="Dim Row() As Object = tableDataView.Items.Get(t";
_row = (Object[])(_tabledataview.getItems().Get(_tabledataview.getSelectedRow()));
 //BA.debugLineNum = 419;BA.debugLine="Dim strKeyname As String = Row(0)";
_strkeyname = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 420;BA.debugLine="kvs.Remove(Row(0))";
_kvs._remove(BA.ObjectToString(_row[(int) (0)]));
 //BA.debugLineNum = 421;BA.debugLine="tableDataView.Items.RemoveAt(tableDataView.Sele";
_tabledataview.getItems().RemoveAt(_tabledataview.getSelectedRow());
 //BA.debugLineNum = 422;BA.debugLine="DisplayStatusMessage(\"Record removed from KVS.\"";
_displaystatusmessage("Record removed from KVS.");
 //BA.debugLineNum = 423;BA.debugLine="ChangeStatusBarMessage(\"The selected record for";
_changestatusbarmessage("The selected record for the key "+anywheresoftware.b4a.keywords.Common.QUOTE+_strkeyname+anywheresoftware.b4a.keywords.Common.QUOTE+" has been permanently removed from: "+BA.ObjectToString(_combofilefield.getItems().Get(_combofilefield.getSelectedIndex())));
 //BA.debugLineNum = 424;BA.debugLine="refreshTableView";
_refreshtableview();
 }else {
 //BA.debugLineNum = 426;BA.debugLine="DisplayStatusMessage(\"Record deletion has been";
_displaystatusmessage("Record deletion has been cancelled.");
 };
 };
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
return "";
}
public static String  _menuvalidatorcsv_action() throws Exception{
 //BA.debugLineNum = 708;BA.debugLine="Sub menuValidatorCSV_Action";
 //BA.debugLineNum = 709;BA.debugLine="fx.ShowExternalDocument(\"http://csvlint.io/\")";
_fx.ShowExternalDocument("http://csvlint.io/");
 //BA.debugLineNum = 710;BA.debugLine="ChangeStatusBarMessage(\"Opened webpage : http://c";
_changestatusbarmessage("Opened webpage : http://csvlint.io/");
 //BA.debugLineNum = 711;BA.debugLine="End Sub";
return "";
}
public static String  _menuvalidatorjson_action() throws Exception{
 //BA.debugLineNum = 713;BA.debugLine="Sub menuValidatorJSON_Action";
 //BA.debugLineNum = 714;BA.debugLine="fx.ShowExternalDocument(\"http://jsonlint.com/\")";
_fx.ShowExternalDocument("http://jsonlint.com/");
 //BA.debugLineNum = 715;BA.debugLine="ChangeStatusBarMessage(\"Opened webpage : http://j";
_changestatusbarmessage("Opened webpage : http://jsonlint.com/");
 //BA.debugLineNum = 716;BA.debugLine="End Sub";
return "";
}
public static String  _menuvalidatorxml_action() throws Exception{
 //BA.debugLineNum = 718;BA.debugLine="Sub menuValidatorXML_Action";
 //BA.debugLineNum = 719;BA.debugLine="fx.ShowExternalDocument(\"http://www.xmlvalidation";
_fx.ShowExternalDocument("http://www.xmlvalidation.com/");
 //BA.debugLineNum = 720;BA.debugLine="ChangeStatusBarMessage(\"Opened webpage : http://w";
_changestatusbarmessage("Opened webpage : http://www.xmlvalidation.com/");
 //BA.debugLineNum = 721;BA.debugLine="End Sub";
return "";
}
public static String  _populatemainformcombobox() throws Exception{
anywheresoftware.b4a.objects.collections.List _recentfileslist = null;
int _i = 0;
 //BA.debugLineNum = 754;BA.debugLine="Sub PopulateMainFormComboBox";
 //BA.debugLineNum = 755;BA.debugLine="comboFileField.Items.Clear";
_combofilefield.getItems().Clear();
 //BA.debugLineNum = 756;BA.debugLine="Dim recentFilesList As List";
_recentfileslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 757;BA.debugLine="recentFilesList.Initialize";
_recentfileslist.Initialize();
 //BA.debugLineNum = 758;BA.debugLine="recentFilesList = kvsRecentItems.ListKeys";
_recentfileslist = _kvsrecentitems._listkeys();
 //BA.debugLineNum = 759;BA.debugLine="For i = 0 To recentFilesList.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_recentfileslist.getSize()-1);
for (_i = (int) (0) ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
 //BA.debugLineNum = 760;BA.debugLine="If recentFilesList.Get(i) <> \"\" And recentFil";
if ((_recentfileslist.Get(_i)).equals((Object)("")) == false && (_recentfileslist.Get(_i)).equals((Object)("ExistingFilePath")) == false) { 
 //BA.debugLineNum = 761;BA.debugLine="If File.Exists(kvsRecentItems.GetSimple(recentF";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_kvsrecentitems._getsimple(BA.ObjectToString(_recentfileslist.Get(_i))),BA.ObjectToString(_recentfileslist.Get(_i)))==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 762;BA.debugLine="kvsRecentItems.Remove(recentFilesList.Get(i))";
_kvsrecentitems._remove(BA.ObjectToString(_recentfileslist.Get(_i)));
 }else {
 //BA.debugLineNum = 764;BA.debugLine="comboFileField.Items.Add(File.Combine(kvsRecen";
_combofilefield.getItems().Add((Object)(anywheresoftware.b4a.keywords.Common.File.Combine(_kvsrecentitems._getsimple(BA.ObjectToString(_recentfileslist.Get(_i))),BA.ObjectToString(_recentfileslist.Get(_i)))));
 //BA.debugLineNum = 765;BA.debugLine="boolIsRecentItems = True";
_boolisrecentitems = anywheresoftware.b4a.keywords.Common.True;
 };
 };
 }
};
 //BA.debugLineNum = 769;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 //BA.debugLineNum = 770;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
		
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
 //BA.debugLineNum = 11;BA.debugLine="Private kvs As KeyValueStore";
_kvs = new b4j.example.keyvaluestore();
 //BA.debugLineNum = 12;BA.debugLine="Private kvsRecentItems As KeyValueStore";
_kvsrecentitems = new b4j.example.keyvaluestore();
 //BA.debugLineNum = 13;BA.debugLine="Private dialogue8 As Dialogs8";
_dialogue8 = new b4j.example.dialogs8();
 //BA.debugLineNum = 14;BA.debugLine="Private strExistingFilePath As String";
_strexistingfilepath = "";
 //BA.debugLineNum = 15;BA.debugLine="Private tableDataView As TableView";
_tabledataview = new anywheresoftware.b4j.objects.TableViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private txtPassword As TextField";
_txtpassword = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private btnSelectFile As Button";
_btnselectfile = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private btnReload As Button";
_btnreload = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private comboFileField As ComboBox";
_combofilefield = new anywheresoftware.b4j.objects.ComboBoxWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private tableviewRowIndex As Int";
_tableviewrowindex = 0;
 //BA.debugLineNum = 21;BA.debugLine="Private tableviewColIndex As Int";
_tableviewcolindex = 0;
 //BA.debugLineNum = 22;BA.debugLine="Private tableviewCell As Object";
_tableviewcell = new Object();
 //BA.debugLineNum = 23;BA.debugLine="Private txtAddEditKeyname As TextField";
_txtaddeditkeyname = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private txtAddEditValue As TextArea";
_txtaddeditvalue = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private tmr As Timer";
_tmr = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 26;BA.debugLine="Private lblStatus As Label";
_lblstatus = new anywheresoftware.b4j.objects.LabelWrapper();
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
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _recentitemsenabledisablemenuitem() throws Exception{
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
 //BA.debugLineNum = 772;BA.debugLine="Sub RecentItemsEnableDisableMenuItem";
 //BA.debugLineNum = 773;BA.debugLine="If boolIsRecentItems = False Then";
if (_boolisrecentitems==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 774;BA.debugLine="If mapMenus.ContainsKey(\"mnuRecent\") = True Then";
if (_mapmenus.ContainsKey((Object)("mnuRecent"))==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 775;BA.debugLine="Dim mi As MenuItem = mapMenus.Get(\"mnuRecent\")";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapmenus.Get((Object)("mnuRecent"))));
 //BA.debugLineNum = 776;BA.debugLine="mi.Enabled = False";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
 //BA.debugLineNum = 779;BA.debugLine="If mapMenus.ContainsKey(\"mnuRecent\") = True Then";
if (_mapmenus.ContainsKey((Object)("mnuRecent"))==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 780;BA.debugLine="Dim mi As MenuItem = mapMenus.Get(\"mnuRecent\")";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(_mapmenus.Get((Object)("mnuRecent"))));
 //BA.debugLineNum = 781;BA.debugLine="mi.Enabled = True";
_mi.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 };
 //BA.debugLineNum = 784;BA.debugLine="End Sub";
return "";
}
public static String  _refreshtableview() throws Exception{
anywheresoftware.b4a.objects.collections.List _tempdata = null;
int _i = 0;
Object[] _r = null;
 //BA.debugLineNum = 283;BA.debugLine="Sub refreshTableView";
 //BA.debugLineNum = 284;BA.debugLine="Dim tempData As List";
_tempdata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 285;BA.debugLine="tempData.Initialize";
_tempdata.Initialize();
 //BA.debugLineNum = 286;BA.debugLine="tempData.AddAll(tableDataView.Items)";
_tempdata.AddAll(_tabledataview.getItems());
 //BA.debugLineNum = 287;BA.debugLine="tableDataView.Items.Clear";
_tabledataview.getItems().Clear();
 //BA.debugLineNum = 288;BA.debugLine="For i = 0 To tempData.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_tempdata.getSize()-1);
for (_i = (int) (0) ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
 //BA.debugLineNum = 289;BA.debugLine="Dim r() As Object = tempData.Get(i)";
_r = (Object[])(_tempdata.Get(_i));
 //BA.debugLineNum = 290;BA.debugLine="tableDataView.Items.Add(Array As Object(r(";
_tabledataview.getItems().Add((Object)(new Object[]{_r[(int) (0)],_r[(int) (1)]}));
 }
};
 //BA.debugLineNum = 292;BA.debugLine="tableDataView.SelectedRow = 0";
_tabledataview.setSelectedRow((int) (0));
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return "";
}
public static String  _saverecentitems(String _strpath,String _strfile) throws Exception{
 //BA.debugLineNum = 745;BA.debugLine="Sub SaveRecentItems(strPath As String, strFile As";
 //BA.debugLineNum = 746;BA.debugLine="If kvsRecentItems.ContainsKey(strFile) = False Th";
if (_kvsrecentitems._containskey(_strfile)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 747;BA.debugLine="kvsRecentItems.PutSimple(strFile, strPath)";
_kvsrecentitems._putsimple(_strfile,(Object)(_strpath));
 //BA.debugLineNum = 748;BA.debugLine="boolIsRecentItems = True";
_boolisrecentitems = anywheresoftware.b4a.keywords.Common.True;
 };
 //BA.debugLineNum = 750;BA.debugLine="PopulateMainFormComboBox";
_populatemainformcombobox();
 //BA.debugLineNum = 751;BA.debugLine="RecentItemsEnableDisableMenuItem";
_recentitemsenabledisablemenuitem();
 //BA.debugLineNum = 752;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 788;BA.debugLine="Sub SuggestProfileNameForPrintSaveExport(TypeOfFil";
 //BA.debugLineNum = 790;BA.debugLine="Dim suggestFileName As String";
_suggestfilename = "";
 //BA.debugLineNum = 791;BA.debugLine="Dim now As Long";
_now = 0L;
 //BA.debugLineNum = 792;BA.debugLine="now = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 793;BA.debugLine="Dim year As String = DateTime.GetYear(now)";
_year = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_now));
 //BA.debugLineNum = 794;BA.debugLine="Dim month As String = DateTime.GetMonth(now)";
_month = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_now));
 //BA.debugLineNum = 795;BA.debugLine="Dim day As String = DateTime.GetDayOfMonth(now)";
_day = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(_now));
 //BA.debugLineNum = 796;BA.debugLine="Dim hour As String = DateTime.GetHour(now)";
_hour = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetHour(_now));
 //BA.debugLineNum = 797;BA.debugLine="Dim minute As String = DateTime.GetMinute(now)";
_minute = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetMinute(_now));
 //BA.debugLineNum = 798;BA.debugLine="Dim second As String = DateTime.GetSecond(now)";
_second = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetSecond(_now));
 //BA.debugLineNum = 799;BA.debugLine="If TypeOfFile = \"csv\" Then";
if ((_typeoffile).equals("csv")) { 
 //BA.debugLineNum = 800;BA.debugLine="suggestFileName = \"kvs_\" & year & \"-\" & month &";
_suggestfilename = "kvs_"+_year+"-"+_month+"-"+_day+"_"+_hour+"-"+_minute+"-"+_second+".csv";
 }else if((_typeoffile).equals("json")) { 
 //BA.debugLineNum = 802;BA.debugLine="suggestFileName = \"kvs_\" & year & \"-\" & month &";
_suggestfilename = "kvs_"+_year+"-"+_month+"-"+_day+"_"+_hour+"-"+_minute+"-"+_second+".json";
 }else if((_typeoffile).equals("xml")) { 
 //BA.debugLineNum = 804;BA.debugLine="suggestFileName = \"kvs_\" & year & \"-\" & month &";
_suggestfilename = "kvs_"+_year+"-"+_month+"-"+_day+"_"+_hour+"-"+_minute+"-"+_second+".xml";
 }else {
 //BA.debugLineNum = 806;BA.debugLine="suggestFileName = \"kvs_\" & year & \"-\" & month &";
_suggestfilename = "kvs_"+_year+"-"+_month+"-"+_day+"_"+_hour+"-"+_minute+"-"+_second+".txt";
 };
 //BA.debugLineNum = 808;BA.debugLine="Return suggestFileName";
if (true) return _suggestfilename;
 //BA.debugLineNum = 809;BA.debugLine="End Sub";
return "";
}
public static String  _tabledataview_selectedcellchanged(int _rowindex,int _colindex,Object _cell) throws Exception{
 //BA.debugLineNum = 822;BA.debugLine="Sub tableDataView_SelectedCellChanged (RowIndex As";
 //BA.debugLineNum = 823;BA.debugLine="tableviewRowIndex = RowIndex";
_tableviewrowindex = _rowindex;
 //BA.debugLineNum = 824;BA.debugLine="tableviewColIndex = ColIndex";
_tableviewcolindex = _colindex;
 //BA.debugLineNum = 825;BA.debugLine="tableviewCell = Cell";
_tableviewcell = _cell;
 //BA.debugLineNum = 826;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub Timer1_tick";
 //BA.debugLineNum = 81;BA.debugLine="lblStatus.Text = \"\"";
_lblstatus.setText("");
 //BA.debugLineNum = 82;BA.debugLine="tmr.Enabled = False";
_tmr.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
}
