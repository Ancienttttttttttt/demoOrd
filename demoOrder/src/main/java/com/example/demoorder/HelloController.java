package com.example.demoorder;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.converter.FloatStringConverter;



import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;

public class HelloController {
        public BorderPane BorderPaneAddPrices;
        public Pane PaneAddPrices;
        public Label LabelPrice;
        public TextField NameAddPrice;
        public TextField PriceAddPrice;
        public TextField PrimAddPrice;
        public TextField DopAddPrice;
        public Button AddButtonPrice;
        public Button AddButtonCancel;
        public TextArea RaschetEtcTextField;
        String str = "jdbc:mysql://localhost:3306/ordersql";
        String login = "root";
        String passw = "google72";


        @FXML
        private Button AddBPPriceButton;

        @FXML
        private Button AddCPUPriceButton;

        @FXML
        private Button AddCabelPriceButton;

        @FXML
        private Button AddColonkiPriceButton;

        @FXML
        private Button AddCoolerPriceButton;

        @FXML
        private Button AddCorpusPriceButton;

        @FXML
        private Button AddCovrikPriceButton;

        @FXML
        private Button AddEtcPriceButton;

        @FXML
        private Button AddFDDPriceButton;

        @FXML
        private Button AddHDDPriceButton;

        @FXML
        private Button AddKeyboardPriceButton;

        @FXML
        private Button AddMicrofonPriceButton;

        @FXML
        private Button AddModemPriceButton;

        @FXML
        private Button AddMonitorPriceButton;

        @FXML
        private Button AddMousePriceButton;

        @FXML
        private Button AddNetworkcardPrice;

        @FXML
        private Button AddOrder;

        @FXML
        private Button AddPitaniePriceButton;

        @FXML
        private Button AddPlataPriceButton;

        @FXML
        private Button AddPrinterPriceButton;

        @FXML
        private Button AddRAMPriceButton;

        @FXML
        private Button AddScanerPriceButton;

        @FXML
        private Button AddSoftPriceButton;

        @FXML
        private Button AddVideocardPriceButton;

        @FXML
        private Button AddVolumecardPriceButton;

        @FXML
        private ComboBox<String> AllClientsAddOrder;

        @FXML
        private TableColumn<CPUTable, String> BP;

        @FXML
        private Button BackOrderButton;

        @FXML
        private Button BackToMenu;

        @FXML
        private Button BackToMenuBPPrice;

        @FXML
        private Button BackToMenuButton;

        @FXML
        private Button BackToMenuCPUPrice;

        @FXML
        private Button BackToMenuColonkiPrice;

        @FXML
        private Button BackToMenuCoolerPrice;

        @FXML
        private Button BackToMenuCorpusButton;

        @FXML
        private Button BackToMenuCovrikPrice;

        @FXML
        private Button BackToMenuEtcPrice;

        @FXML
        private Button BackToMenuFDDPrice;

        @FXML
        private Button BackToMenuHDDPrice;

        @FXML
        private Button BackToMenuKeyboardPrice;

        @FXML
        private Button BackToMenuMicrofonPrice;

        @FXML
        private Button BackToMenuModemPrice;

        @FXML
        private Button BackToMenuMonitor;

        @FXML
        private Button BackToMenuMousePrice;

        @FXML
        private Button BackToMenuNetworkcard;

        @FXML
        private Button BackToMenuPitaniePrice;

        @FXML
        private Button BackToMenuPlataPrice;

        @FXML
        private Button BackToMenuPriceCabeli;

        @FXML
        private Button BackToMenuPrinterPrice;

        @FXML
        private Button BackToMenuRAMPrice;

        @FXML
        private Button BackToMenuScanerPrice;

        @FXML
        private Button BackToMenuSoftPrice;

        @FXML
        private Button BackToMenuVideocardPrice;

        @FXML
        private Button BackToMenuVolumecard;

        @FXML
        private BorderPane BorderPaneAddOrder;

        @FXML
        private BorderPane BorderPaneBPPrice;

        @FXML
        private BorderPane BorderPaneCPUPrice;

        @FXML
        private BorderPane BorderPaneCabelPrice;

        @FXML
        private BorderPane BorderPaneColonkiPrice;

        @FXML
        private BorderPane BorderPaneCoolerPrice;

        @FXML
        private BorderPane BorderPaneCovrikPrice;

        @FXML
        private BorderPane BorderPaneDatabaseOrder;

        @FXML
        private BorderPane BorderPaneEtcPrice;

        @FXML
        private BorderPane BorderPaneFDDPrice;

        @FXML
        private BorderPane BorderPaneHDDPrice;

        @FXML
        private BorderPane BorderPaneMenu;

        @FXML
        private BorderPane BorderPaneMicrofonPrice;

        @FXML
        private BorderPane BorderPaneModem;

        @FXML
        private BorderPane BorderPaneMonitorPrice;

        @FXML
        private BorderPane BorderPaneMousePrice;

        @FXML
        private BorderPane BorderPaneNetworkcardPrice;

        @FXML
        private BorderPane BorderPanePitaniePrice;

        @FXML
        private BorderPane BorderPanePrice;

        @FXML
        private BorderPane BorderPanePriceCorpus;

        @FXML
        private BorderPane BorderPanePriceKeyboard;

        @FXML
        private BorderPane BorderPanePrinterPrice;

        @FXML
        private BorderPane BorderPaneRAMPrice;

        @FXML
        private BorderPane BorderPaneScanerPrice;

        @FXML
        private BorderPane BorderPaneSoftPrice;

        @FXML
        private BorderPane BorderPaneVideocardPrice;

        @FXML
        private BorderPane BorderPaneVolumecardPrice;

        @FXML
        private BorderPane BorderPlataPrice;

        @FXML
        public TableColumn<CPUTable, String> CPU;

        @FXML
        private TableColumn<CPUTable, String> Cabel;

        @FXML
        private Button CancelAddOrder;

        @FXML
        private Button ChangeBPPriceButton;

        @FXML
        private Button ChangeCPUPriceButton;

        @FXML
        private Button ChangeCabelPriceButton;

        @FXML
        private Button ChangeColonkiPriceButton;

        @FXML
        private Button ChangeCoolerPriceButton;

        @FXML
        private Button ChangeCorpusPriceButton;

        @FXML
        private Button ChangeCovrikPriceButton;

        @FXML
        private Button ChangeFDDPriceButton;

        @FXML
        private Button ChangeFilterAddOrder;

        @FXML
        private Button ChangeHDDPriceButton;

        @FXML
        private Button ChangeKeyboardPriceButton;

        @FXML
        private Button ChangeMicrofonPriceButton;

        @FXML
        private Button ChangeModemPriceButton;

        @FXML
        private Button ChangeMonitorPriceButton;

        @FXML
        private Button ChangeMousePriceButton;

        @FXML
        private Button ChangeNetworkcardPrice;

        @FXML
        private Button ChangePitaniePriceButton;

        @FXML
        private Button ChangePlataPriceButton;

        @FXML
        private Button ChangePriceEtcButton;

        @FXML
        private Button ChangePrinterPriceButton;

        @FXML
        private Button ChangeRAMPriceButton;

        @FXML
        private Button ChangeScanerPriceButton;

        @FXML
        private Button ChangeSoftPriceButton;

        @FXML
        private Button ChangeVideocardPriceButton;

        @FXML
        private Button ChangeVolumecardPriceButton;

        @FXML
        private TextField ClientAddOrder;

        @FXML
        private TableColumn<?, ?> ClientDatabaseOrder;

        @FXML
        private TableColumn<CPUTable, String> Colonki;

        @FXML
        private TableColumn<?, ?> ColvoDatabaseOrder;

        @FXML
        private TextArea CommAddOrder;

        @FXML
        private TextArea ContactAddOrder;

        @FXML
        private TableColumn<CPUTable, String> Cooler;

        @FXML
        private TableColumn<?, ?> CoolerDatabaseOrder;

        @FXML
        private TableColumn<CPUTable, String> Corpus;

        @FXML
        private BorderPane CorrectBorderPane;

        @FXML
        private BorderPane BorderPaneSSDPrice;

        @FXML
        private Button ChangeSDDPriceButton;

        @FXML
        private Button AddSDDPriceButton;

        @FXML
        private Button DeleteSDDPriceButton;

        @FXML
        private Button FilterSDDPriceButton;

        @FXML
        private Pane PaneSSDPrice;

        @FXML
        private Button RenewSDDPriceButton;

        @FXML
        private Button SaveSDDPriceButton;

        @FXML
        private Button BackToMenuSSDPrice;

        @FXML
        private ComboBox<?> CorrectCPUCore;

        @FXML
        private TextField CorrectCPUField;

        @FXML
        private TextField CorrectCPUPrice;

        @FXML
        private TextField CorrectCPUSer;

        @FXML
        private ComboBox<?> CorrectClient;

        @FXML
        private TextField CorrectColonkiField;

        @FXML
        private TextField CorrectColonkiPrice;

        @FXML
        private TextField CorrectColonkiSer;

        @FXML
        private TextField CorrectColvo;

        @FXML
        private TextField CorrectCoolerField;

        @FXML
        private TextField CorrectCoolerPrice;

        @FXML
        private TextField CorrectCoolerSer;

        @FXML
        private TextField CorrectCorpusField;

        @FXML
        private TextField CorrectCorpusPrice;

        @FXML
        private TextField CorrectCorpusSer;

        @FXML
        private TextField CorrectCovrikField;

        @FXML
        private TextField CorrectCovrikPrice;

        @FXML
        private TextField CorrectCovrikSer;

        @FXML
        private DatePicker CorrectDataSdachi;

        @FXML
        private DatePicker CorrectDataVipiski;

        @FXML
        private TextField CorrectDopcabeliSer;

        @FXML
        private TextField CorrectDopkabeliField;

        @FXML
        private TextField CorrectDopkabeliPrice;

        @FXML
        private TextField CorrectEtcField;

        @FXML
        private TextField CorrectEtcPrice;

        @FXML
        private TextField CorrectEtcSer;

        @FXML
        private TextField CorrectFDDField;

        @FXML
        private TextField CorrectFDDPrice;

        @FXML
        private TextField CorrectFDDSer;

        @FXML
        private ComboBox<?> CorrectFormOplati;

        @FXML
        private TextField CorrectGarant;

        @FXML
        private TextField CorrectHDDField;

        @FXML
        private TextField CorrectHDDPrice;

        @FXML
        private TextField CorrectHDDSer;

        @FXML
        private TextField CorrectKeyboardField;

        @FXML
        private TextField CorrectKeyboardPrice;

        @FXML
        private TextField CorrectKeyboardSer;

        @FXML
        private TextField CorrectModemField;

        @FXML
        private TextField CorrectModemPrice;

        @FXML
        private TextField CorrectModemSer;

        @FXML
        private TextField CorrectMonitorField;

        @FXML
        private TextField CorrectMonitorPrice;

        @FXML
        private TextField CorrectMonitorSer;

        @FXML
        private TextArea RaschetEtcTextArea;

        @FXML
        private TextField CorrectMouseField;

        @FXML
        private TextField CorrectMousePrice;

        @FXML
        private TextField CorrectMouseSer;

        @FXML
        private TextField CorrectNetworkcardField;

        @FXML
        private TextField CorrectNetworkcardPrice;

        @FXML
        private TextField CorrectNetworkcardSer;

        @FXML
        private TextField CorrectNumberOrder;

        @FXML
        private Pane CorrectPane;

        @FXML
        private TextField CorrectPitanieField;

        @FXML
        private TextField CorrectPitaniePrice;

        @FXML
        private TextField CorrectPitanieSer;

        @FXML
        private TextField CorrectPlataField;

        @FXML
        private TextField CorrectPlataPrice;

        @FXML
        private TextField CorrectPlataSer;

        @FXML
        private Button CorrectPrintOrder;

        @FXML
        private TextField CorrectPrinterField;

        @FXML
        private TextField CorrectPrinterPrice;

        @FXML
        private TextField CorrectPrinterSer;

        @FXML
        private TextField CorrectRAMField;

        @FXML
        private TextField CorrectRAMPrice;

        @FXML
        private TextField CorrectRAMSer;

        @FXML
        private TextField CorrectScanerField;

        @FXML
        private TextField CorrectScanerPrice;

        @FXML
        private TextField CorrectScanerSer;

        @FXML
        private TextField CorrectSoftField;

        @FXML
        private TextField CorrectSoftPrice;

        @FXML
        private TextField CorrectSoftSer;

        @FXML
        private TextField CorrectSumm;

        @FXML
        private TextField CorrectVideocardField;

        @FXML
        private TextField CorrectVideocardPrice;

        @FXML
        private TextField CorrectVideocardSer;

        @FXML
        private TextField CorrectVolumecardField;

        @FXML
        private TextField CorrectVolumecardPrice;

        @FXML
        private TextField CorrectVolumecardSer;

        @FXML
        private Button CorrectingOrdersButton;

        @FXML
        private TableColumn<CPUTable, String> Covrik;

        @FXML
        private DatePicker DataSdachiAddOrder;

        @FXML
        private TableColumn<?, ?> DataSdachiDatabaseOrder;

        @FXML
        private TableColumn<?, ?> DataVipiskiDatabaseOrder;

        @FXML
        private Button DatabaseOrder;

        @FXML
        private Button DeleteBPPriceButton;

        @FXML
        private Button DeleteCPUPriceButton;

        @FXML
        private Button DeleteCabelPriceButton;

        @FXML
        private Button DeleteColonkiPriceButton;

        @FXML
        private Button DeleteCoolerPriceButton;

        @FXML
        private Button DeleteCorpusPriceButton;

        @FXML
        private Button DeleteCorrectOrderButton;

        @FXML
        private Button DeleteCovrikPriceButton;

        @FXML
        private Button DeleteEtcPriceButton;

        @FXML
        private Button DeleteFDDPriceButton;

        @FXML
        private Button DeleteHDDPriceButton;

        @FXML
        private Button DeleteKeyboardPriceButton;

        @FXML
        private Button DeleteMicrofonPriceButton;

        @FXML
        private Button DeleteModemPriceButton;

        @FXML
        private Button DeleteMonitorPriceButton;

        @FXML
        private Button DeleteMousePriceButton;

        @FXML
        private Button DeleteNetworkcard;

        @FXML
        private Button DeletePitaniePriceButton;

        @FXML
        private Button DeletePlataPriceButton;

        @FXML
        private Button DeletePrinterPriceButton;

        @FXML
        private Button DeleteRAMPriceButton;

        @FXML
        private Button DeleteScanerPriceButton;

        @FXML
        private Button DeleteSoftPriceButton;

        @FXML
        private Button DeleteVideocardPriceButton;

        @FXML
        private Button DeleteVolumecardPriceButton;

        @FXML
        private TableColumn<CPUTable, String> DopBP;

        @FXML
        public TableColumn<CPUTable, String> DopCPU;

        @FXML
        private TableColumn<CPUTable, String> DopCabel;

        @FXML
        private TableColumn<CPUTable, String> DopColonki;

        @FXML
        private TableColumn<CPUTable, String> DopCooler;

        @FXML
        private TableColumn<CPUTable, String> DopCorpus;

        @FXML
        private TableColumn<CPUTable, String> DopCovrik;

        @FXML
        private TableColumn<CPUTable, String> DopEtc;

        @FXML
        private TableColumn<CPUTable, String> DopFDD;

        @FXML
        private TableColumn<CPUTable, String> DopHDD;

        @FXML
        private TableColumn<CPUTable, String> DopKeyboard;

        @FXML
        private TableColumn<CPUTable, String> DopMicrofon;

        @FXML
        private TableColumn<CPUTable, String> DopModem;

        @FXML
        private TableColumn<CPUTable, String> DopMonitor;

        @FXML
        private TableColumn<CPUTable, String> DopMouse;

        @FXML
        private TableColumn<CPUTable, String> DopNetworkcard;

        @FXML
        private TableColumn<CPUTable, String> DopPitanie;

        @FXML
        private TableColumn<CPUTable, String> DopPrice;

        @FXML
        private TableColumn<CPUTable, String> DopPrinter;

        @FXML
        private TableColumn<CPUTable, String> DopRAM;

        @FXML
        private TableColumn<CPUTable, String> DopScaner;

        @FXML
        private TableColumn<CPUTable, String> DopSoft;

        @FXML
        private TableColumn<CPUTable, String> DopVideocard;

        @FXML
        private TableColumn<CPUTable, String> DopVolumecard;

        @FXML
        private Button EnterToBase;

        @FXML
        private TableColumn<CPUTable, String> Etc;

        @FXML
        private TableColumn<?, ?> EtcDatabaseORder;

        @FXML
        private Button Exit;

        @FXML
        private Button ExitMenu;

        @FXML
        private Button ExitToMenu;

        @FXML
        private Button ExitToMenuButton1;

        @FXML
        private TableColumn<CPUTable, String> FDD;

        @FXML
        private Button FilterBPPriceButton;

        @FXML
        private Button FilterCPUPriceButton;

        @FXML
        private Button FilterCabelPriceButton;

        @FXML
        private Button FilterColonkiPriceButton;

        @FXML
        private Button FilterCoolerPriceButton;

        @FXML
        private Button FilterCorpusPrice;

        @FXML
        private Button FilterCovrikPriceButton;

        @FXML
        private Button FilterEtcPrice;

        @FXML
        private Button FilterFDDPriceButton;

        @FXML
        private Button FilterHDDPriceButton;

        @FXML
        private Button FilterKeyboardPriceButton;

        @FXML
        private Button FilterMicrofonPriceButton;

        @FXML
        private Button FilterModemPriceButton;

        @FXML
        private Button FilterMonitorPriceButton;

        @FXML
        private Button FilterMousePriceButton;

        @FXML
        private Button FilterNetworkcardPrice;

        @FXML
        private Button FilterPitaniePriceButton;

        @FXML
        private Button FilterPlataPriceButton;

        @FXML
        private Button FilterPrinterPriceButton;

        @FXML
        private Button FilterRAMPriceButton;

        @FXML
        private Button FilterScanerPriceButton;

        @FXML
        private Button FilterSoftPriceButton;

        @FXML
        private Button FilterVideocardPriceButton;

        @FXML
        private Button FilterVolumecardPriceButton;

        @FXML
        private TableColumn<?, ?> FormDatabaseOrder;

        @FXML
        private Button ForwardOrderButton;

        @FXML
        private TableColumn<CPUTable, String> HDD;

        @FXML
        private TableColumn<?, ?> HDDDatabaseOrder;

        @FXML
        private TableColumn<CPUTable, Integer> IDBP;

        @FXML
        public TableColumn<CPUTable, Integer> IDCPU;

        @FXML
        private TableColumn<CPUTable, Integer> IDCabeli;

        @FXML
        private TableColumn<CPUTable, Integer> IDColonki;

        @FXML
        private TableColumn<CPUTable, Integer> IDCooler;

        @FXML
        private TableColumn<CPUTable, Integer> IDCorpus;

        @FXML
        private TableColumn<CPUTable, Integer> IDCovrik;

        @FXML
        private TableColumn<CPUTable, Integer> IDEtc;

        @FXML
        private TableColumn<CPUTable, Integer> IDFDD;

        @FXML
        private TableColumn<CPUTable, Integer> IDHDD;

        @FXML
        private TableColumn<CPUTable, Integer> IDKeyboard;

        @FXML
        private TableColumn<CPUTable, Integer> IDMicrofon;

        @FXML
        private TableColumn<CPUTable, Integer> IDModem;

        @FXML
        private TableColumn<CPUTable, Integer> IDMonitor;

        @FXML
        private TableColumn<CPUTable, Integer> IDMouse;

        @FXML
        private TableColumn<CPUTable, Integer> IDNetworkcard;

        @FXML
        private TableColumn<?, ?> IDOrder;

        @FXML
        private ComboBox<String> RaschetEtcField;

        @FXML
        private TableColumn<CPUTable, Integer> IDPitanie;

        @FXML
        private TableColumn<CPUTable, Integer> IDPlata;

        @FXML
        private TableColumn<CPUTable, Integer> IDPrinter;

        @FXML
        private TableColumn<CPUTable, Integer> IDRAM;

        @FXML
        private TableColumn<CPUTable, Integer> IDScaner;

        @FXML
        private TableColumn<CPUTable, Integer> IDSoft;

        @FXML
        private TableColumn<CPUTable, Integer> IDVideocard;

        @FXML
        private TableColumn<CPUTable, Integer> IDVolumecard;

        @FXML
        private TableColumn<?, ?> ItogoDatabaseOrder;

        @FXML
        private TableColumn<CPUTable, String> Keyboard;

        @FXML
        private BorderPane LoginBorderPane;

        @FXML
        private Pane LoginPane;

        @FXML
        private TextField LoginText;

        @FXML
        private AnchorPane Main;

        @FXML
        private Button MaxBackOrderButton;

        @FXML
        private Button MaxForwardOrderButton;

        @FXML
        private TableColumn<CPUTable, String> Microfon;

        @FXML
        private TableColumn<CPUTable, String> Modem;

        @FXML
        private TableColumn<CPUTable, String> Monitor;

        @FXML
        private TableColumn<CPUTable, Float> MonitorPrice;

        @FXML
        private TableColumn<CPUTable, String> Mouse;

        @FXML
        private ComboBox<String> NamePriceField;

        @FXML
        private TableColumn<CPUTable, String> Networkcard;

        @FXML
        private TableColumn<?, ?> OplachenoDatabaseORder;

        @FXML
        private Pane PaneAddOrder;

        @FXML
        private Pane PaneBPPrice;

        @FXML
        private Pane PaneCPUPrice;

        @FXML
        private Pane PaneCabelPrice;

        @FXML
        private Pane PaneColonkiPrice;

        @FXML
        private Pane PaneCoolerPrice;

        @FXML
        private Pane PaneCovrikPrice;

        @FXML
        private Pane PaneDatabaseOrder;

        @FXML
        private Pane PaneEtcPrice;

        @FXML
        private Pane PaneFDDPrice;

        @FXML
        private Pane PaneHDDPrice;

        @FXML
        private Pane PaneMenu;

        @FXML
        private Pane PaneMicrofonPrice;

        @FXML
        private Pane PaneModemPrice;

        @FXML
        private Pane PaneMonitorPrice;

        @FXML
        private Pane PaneMousePrice;

        @FXML
        private Pane PaneNetworkcardPrice;

        @FXML
        private Pane PanePitaniePrice;

        @FXML
        private Pane PanePlataPrice;

        @FXML
        private Pane PanePrice;

        @FXML
        private Pane PanePriceCorpus;

        @FXML
        private Pane PanePriceKeyboard;

        @FXML
        private Pane PanePrinterPrice;

        @FXML
        private Pane PaneRAMPrice;

        @FXML
        private Pane PaneScanerPrice;

        @FXML
        private Pane PaneSoftPrice;

        @FXML
        private Pane PaneVideocardPrice;

        @FXML
        private Pane PaneVolumecard;

        @FXML
        private PasswordField PasswordText;

        @FXML
        private TableColumn<CPUTable, String> Pitanie;

        @FXML
        private TableColumn<CPUTable, String> Plata;

        @FXML
        private TableColumn<?, ?> PlataDatabaseOrder;

        @FXML
        private TableColumn<CPUTable, Float> PlataPrice;

        @FXML
        private TextField PredoplataAddOrder;

        @FXML
        private TableColumn<CPUTable, Float> PriceBP;

        @FXML
        private TextField PriceBPField;

        @FXML
        private Button PriceButton;

        @FXML
        public TableColumn<CPUTable, Float> PriceCPU;

        @FXML
        private TextField PriceCPUField;

        @FXML
        private TableColumn<CPUTable, Float> PriceCabel;

        @FXML
        private TableColumn<CPUTable, Float> PriceColonki;

        @FXML
        private TextField PriceColonkiField;

        @FXML
        private TableColumn<CPUTable, Float> PriceCooler;

        @FXML
        private TextField PriceCoolerField;

        @FXML
        private TableColumn<CPUTable, Float> PriceCorpus;

        @FXML
        private TextField PriceCorpusField;

        @FXML
        private TableColumn<CPUTable, Float> PriceCovrik;

        @FXML
        private TextField PriceCovrikField;

        @FXML
        private TextField PriceDopcabeliField;

        @FXML
        private TableColumn<CPUTable, Float> PriceEtc;

        @FXML
        private TextField PriceEtcField;

        @FXML
        private TableColumn<CPUTable, Float> PriceFDD;

        @FXML
        private TextField PriceFDDField;

        @FXML
        private TableColumn<CPUTable, Float> PriceHDD;

        @FXML
        private TextField PriceHDDField;

        @FXML
        private TableColumn<CPUTable, Float> PriceKeyboard;

        @FXML
        private TextField PriceKeyboardField;

        @FXML
        private TableColumn<CPUTable, Float> PriceMicrofon;

        @FXML
        private TextField PriceMicrofonField;

        @FXML
        private TextField PriceModemField;

        @FXML
        private TextField PriceMonitorField;

        @FXML
        private TableColumn<CPUTable, Float> PriceMouse;

        @FXML
        private TextField PriceMouseField;

        @FXML
        private TableColumn<CPUTable, Float> PriceNetworkcard;

        @FXML
        private TextField PriceNetworkcardField;

        @FXML
        private TableColumn<CPUTable, Float> PricePitanie;

        @FXML
        private TextField PricePitanieField;

        @FXML
        private TextField PricePlataField;

        @FXML
        private TableColumn<CPUTable, Float> PricePrinter;

        @FXML
        private TextField PricePrinterField;

        @FXML
        private TableColumn<CPUTable, Float> PriceRAM;

        @FXML
        private TextField PriceRAMField;

        @FXML
        private TextField PriceSSDField;

        @FXML
        private TableColumn<CPUTable, Float> PriceScaner;

        @FXML
        private TextField PriceScanerField;

        @FXML
        private TableColumn<CPUTable, Float> PriceSoft;

        @FXML
        private TextField PriceSoftField;

        @FXML
        private TableColumn<CPUTable, Float> PriceVideocard;

        @FXML
        private TextField PriceVideocardField;

        @FXML
        private TableColumn<CPUTable, Float> PriceVolumecard;

        @FXML
        private TextField PriceVolumecardField;

        @FXML
        private TableColumn<CPUTable, Float> PrideModem;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieBP;

        @FXML
        public TableColumn<CPUTable, String> PrimechanieCPU;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieCabel;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieColonki;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieCorpus;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieCovrik;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieEtc;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieFDD;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieHDD;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieKeyboard;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieMicrofon;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieModem;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieMonitor;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieMouse;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieNetworkcard;

        @FXML
        private TableColumn<CPUTable, String> PrimechaniePitanie;

        @FXML
        private TableColumn<CPUTable, String> PrimechaniePrice;

        @FXML
        private TableColumn<CPUTable, String> PrimechaniePrinter;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieRAM;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieScaner;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieSoft;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieVideocard;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieVolumecard;

        @FXML
        private TableColumn<CPUTable, String> PrimexhanieCooler;

        @FXML
        private TableColumn<CPUTable, String> Printer;

        @FXML
        private TableColumn<CPUTable, String> RAM;

        @FXML
        private ComboBox<String> RaschetBPField;

        @FXML
        private BorderPane RaschetBorderPane;

        @FXML
        private Button RaschetButton;

        @FXML
        private ComboBox<String> RaschetCPUField;

        @FXML
        private ComboBox<String> RaschetColonkiField;

        @FXML
        private TextField RaschetColvo;

        @FXML
        private ComboBox<String> RaschetCoolerField;

        @FXML
        private ComboBox<String> RaschetCorpusField;

        @FXML
        private ComboBox<String> RaschetCovrikField;

        @FXML
        private DatePicker RaschetDataVipiski;

        @FXML
        private ComboBox<String> RaschetDopcabeliField;

        @FXML
        private ComboBox<String> RaschetFDDField;

        @FXML
        private ComboBox<String> RaschetFormOplati;

        @FXML
        private ComboBox<String> RaschetHDDField;

        @FXML
        private TextField RaschetItogo;

        @FXML
        private ComboBox<String> RaschetKeyboardField;

        @FXML
        private ComboBox<String> RaschetMicrofonField;

        @FXML
        private ComboBox<String> RaschetModemField;

        @FXML
        private ComboBox<String> RaschetMonitorField;

        @FXML
        private ComboBox<String> RaschetMouseField;

        @FXML
        private ComboBox<String> RaschetNetworkcardField;

        @FXML
        private TextField RaschetNumberOrder;

        @FXML
        private Pane RaschetPane;

        @FXML
        private ComboBox<String> RaschetPitanieField;

        @FXML
        private ComboBox<String> RaschetPlataField;

        @FXML
        private Button RaschetPrint;

        @FXML
        private ComboBox<String> RaschetPrinterField;

        @FXML
        private ComboBox<String> RaschetRAMField;

        @FXML
        private ComboBox<String> RaschetSSDField;

        @FXML
        private ComboBox<String> RaschetScanerField;

        @FXML
        private ComboBox<String> RaschetSoftField;

        @FXML
        private TextField RaschetSumm;

        @FXML
        private ComboBox<String> RaschetVideocardField;

        @FXML
        private ComboBox<String> RaschetVolumecardField;

        @FXML
        private Button RenewBPPriceButton;

        @FXML
        private Button RenewCPUPriceButton;

        @FXML
        private Button RenewCabelPriceButton;

        @FXML
        private Button RenewColonkiPriceButton;

        @FXML
        private Button RenewCoolerPriceButton;

        @FXML
        private Button RenewCorpusPriceButton;

        @FXML
        private Button RenewCovrikPriceButton;

        @FXML
        private Button RenewEtcPriceButton;

        @FXML
        private Button RenewFDDPriceButton;

        @FXML
        private Button RenewHDDPriceButton;

        @FXML
        private Button RenewKeyboardPriceButton;

        @FXML
        private Button RenewMicrofonPriceButton;

        @FXML
        private Button RenewModemPriceButton;

        @FXML
        private Button RenewMonitorPriceButton;

        @FXML
        private Button RenewMousePriceButton;

        @FXML
        private Button RenewNetworkcardPriceButton;

        @FXML
        private Button RenewPitaniePriceButton;

        @FXML
        private Button RenewPlataPriceButton;

        @FXML
        private Button RenewPrinterPriceButton;

        @FXML
        private Button RenewRAMPriceButton;

        @FXML
        private Button RenewScanerPriceButton;

        @FXML
        private Button RenewSoftPriceButton;

        @FXML
        private Button RenewVideocardPriceButton;

        @FXML
        private Button RenewVolumecardPriceButton;

        @FXML
        private Button SaveBPPriceButton;

        @FXML
        private Button SaveCPUPriceButton;

        @FXML
        private Button SaveCabelPriceButton;

        @FXML
        private Button SaveColonkiPriceButton;

        @FXML
        private Button SaveCoolerPriceButton;

        @FXML
        private Button SaveCorpusPriceButton;

        @FXML
        private Button SaveCovrikPriceButton;

        @FXML
        private Button SaveEtcPriceButton;

        @FXML
        private Button SaveFDDPriceButton;

        @FXML
        private Button SaveHDDPriceButton;

        @FXML
        private Button SaveKeyboardPriceButton;

        @FXML
        private Button SaveMicrofonPriceButton;

        @FXML
        private Button SaveModemPriceButton;

        @FXML
        private Button SaveMonitorPriceButton;

        @FXML
        private Button SaveMousePriceButton;

        @FXML
        private Button SaveNetworkcardPriceButton;

        @FXML
        private Button SavePitaniePriceButton;

        @FXML
        private Button SavePlataPriceButton;

        @FXML
        private Button SavePrinterPriceButton;

        @FXML
        private Button SaveRAMPriceButton;

        @FXML
        private Button SaveScanerPriceButton;

        @FXML
        private Button SaveSoftPriceButton;

        @FXML
        private Button SaveToDatabaseOrderButton;

        @FXML
        private Button SaveVideocardPriceButton;

        @FXML
        private Button SaveVolumecardPriceButton;

        @FXML
        private TableColumn<CPUTable, String> Scaner;

        @FXML
        private ScrollPane ScrollPaneDatabaseOrder;

        @FXML
        private TableColumn<?, ?> SofrtDatabaseOrder;

        @FXML
        private TableColumn<CPUTable, String> Soft;

        @FXML
        private TableColumn<?, ?> SummDatabaseOrder;

        @FXML
        private TableView<CPUTable> TableCPUPrice;

        @FXML
        private TableView<CPUTable> TableSDDPrice;

        @FXML
        private TableColumn<CPUTable, Integer> IDSDD;

        @FXML
        private TableColumn<CPUTable, String> SSD;

        @FXML
        private TableColumn<CPUTable, Float> PriceSDD;

        @FXML
        private TableColumn<CPUTable, String> PrimechanieSDD;

        @FXML
        private TableColumn<CPUTable, String> DopSDD;

        @FXML
        private TableView<CPUTable> TableCabeliPrice;

        @FXML
        private TableView<CPUTable> TableColonkiPrice;

        @FXML
        private TableView<CPUTable> TableCoolerPrice;

        @FXML
        private TableView<CPUTable> TableCorpusPrice;

        @FXML
        private TableView<CPUTable> TableCovrikPrice;

        @FXML
        private TableView<?> TableDatabaseOrder;


        @FXML
        private TableView<CPUTable> TableFDDPrice;

        @FXML
        private TableView<CPUTable> TableBPPrice;

        @FXML
        private TableView<CPUTable> TableHDDPrice;

        @FXML
        private TableView<CPUTable> TableKeyboardPrice;

        @FXML
        private TableView<CPUTable> TableMicrofonPrice;

        @FXML
        private TableView<CPUTable> TableModemPrice;

        @FXML
        private TableView<CPUTable> TableMonitorPrice;

        @FXML
        private TableView<CPUTable> TableMousePrice;

        @FXML
        private TableView<CPUTable> TableNetworkcardPrice;

        @FXML
        private TableView<CPUTable> TablePitaniePrice;

        @FXML
        private TableView<CPUTable> TablePlataPrice;

        @FXML
        private TableView<CPUTable> TablePrinterPrice;

        @FXML
        private TableView<CPUTable> TableRAMPrice;

        @FXML
        private TableView<CPUTable> TableScanerPrice;

        @FXML
        private TableView<CPUTable> TableSoftPrice;

        @FXML
        private TableView<CPUTable> TableVideocardPrice;

        @FXML
        private TableView<CPUTable> TableVolumecardPrice;

        @FXML
        private TableColumn<CPUTable, String> Videocard;

        @FXML
        private TableColumn<CPUTable, String> Volumecard;


        private ObservableList<CPUTable> dataTable = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable1 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable2 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable3 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable4 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable5 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable6 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable7 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable8 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable9 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable10 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable11 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable12 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable13 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable14 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable15 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable16 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable17 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable18 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable19 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable20 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable21 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable22 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable23 = FXCollections.observableArrayList();
        private ObservableList<CPUTable> dataTable24 = FXCollections.observableArrayList();

        private ObservableList<AllClients> dataTable25 = FXCollections.observableArrayList();


        public ObservableList<CPUTable> CP() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'Cpu'");
                        while (rs.next()) {
                                dataTable.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


                }
        public ObservableList<CPUTable> Cool() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable1 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'Cooler'");
                        while (rs.next()) {
                                dataTable1.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable1;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Corp() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable2 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'Corpus'");
                        while (rs.next()) {
                                dataTable2.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable2;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Cab() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable3 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'Cabeli'");
                        while (rs.next()) {
                                dataTable3.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable3;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }

        public ObservableList<CPUTable> FD() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable5 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'fdd'");
                        while (rs.next()) {
                                dataTable5.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable5;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> HD() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable6 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'hdd'");
                        while (rs.next()) {
                                dataTable6.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable6;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Key() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable7 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'keyboard'");
                        while (rs.next()) {
                                dataTable7.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable7;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Plat() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable8 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'plata'");
                        while (rs.next()) {
                                dataTable8.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable8;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Mon() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable10 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'monitor'");
                        while (rs.next()) {
                                dataTable10.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable10;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Mod() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable9 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'modem'");
                        while (rs.next()) {
                                dataTable9.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable9;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Mou() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable11 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'mouse'");
                        while (rs.next()) {
                                dataTable11.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable11;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Mic() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable12 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'microfon'");
                        while (rs.next()) {
                                dataTable12.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable12;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Netcard() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable13 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'netcard'");
                        while (rs.next()) {
                                dataTable13.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable13;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Cov() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable14 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'covrik'");
                        while (rs.next()) {
                                dataTable14.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable14;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> BPP() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable15 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'bp'");
                        while (rs.next()) {
                                dataTable15.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable15;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Prin() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable16 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'printer'");
                        while (rs.next()) {
                                dataTable16.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable16;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> RA() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable17 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'ram'");
                        while (rs.next()) {
                                dataTable17.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable17;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Volcard() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable18 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'volcard'");
                        while (rs.next()) {
                                dataTable18.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable18;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Scan() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable19 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'scaner'");
                        while (rs.next()) {
                                dataTable19.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable19;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Sof() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable20 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'soft'");
                        while (rs.next()) {
                                dataTable20.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable20;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Col() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable21 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'colonki'");
                        while (rs.next()) {
                                dataTable21.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable21;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Pit() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable22 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'pitanie'");
                        while (rs.next()) {
                                dataTable22.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable22;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> Vidcard() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable23 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'videocard'");
                        while (rs.next()) {
                                dataTable23.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable23;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }
        public ObservableList<CPUTable> SSD() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<CPUTable> dataTable24 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE TypeProduct = 'ssd'");
                        while (rs.next()) {
                                dataTable24.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                        rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                        }
                        connection.close();
                        return dataTable24;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }


        }

        public ObservableList<AllClients> ClientOrder() {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        ObservableList<AllClients> dataTable25 = FXCollections.observableArrayList();
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM allclients");
                        while (rs.next()) {
                                dataTable25.add(new AllClients(rs.getInt("IdClient"), rs.getString("FIOClient"), rs.getString("Contact"),
                                        rs.getString("Commentary"), rs.getString("DataSdachi"), rs.getInt("Predoplatasql")));
                                System.out.println(dataTable25.get(0));
                        }
                        connection.close();
                        return dataTable25;
                } catch (SQLException e) {
                        throw new RuntimeException("Error while executing SQL query", e);
                }
        }
        public void ActionAddButtonPrice(ActionEvent event) {
                String a = null;

                if (!NameAddPrice.getText().equals("") && !PriceAddPrice.getText().equals("")) {
                        if (form == "процессор") {
                                a = "Cpu";
                        }
                        if (form == "блок питания"){
                                a = "bp";
                        }
                        if (form == "кабели"){
                                a = "Cabeli";
                        }
                        if (form == "колонки"){
                                a = "colonki";
                        }
                        if (form == "кулер"){
                                a = "Cooler";
                        }
                        if (form == "корпус"){
                                a = "Corpus";
                        }
                        if (form == "коврик"){
                                a = "covrik";
                        }
                        if (form == "DVD"){
                                a = "fdd";
                        }
                        if (form == "HDD"){
                                a = "hdd";
                        }
                        if (form == "клавиатура"){
                                a = "keyboard";
                        }
                        if (form == "микрофон"){
                                a = "microfon";
                        }
                        if (form == "модем"){
                                a = "modem";
                        }
                        if (form == "монитор"){
                                a = "monitor";
                        }
                        if (form == "мышь"){
                                a = "mouse";
                        }
                        if (form == "сетевая карта"){
                                a = "netcard";
                        }
                        if (form == "сетевая карта"){
                                a = "netcard";
                        }
                        if (form == "источник бесперебойного питания"){
                                a = "pitanie";
                        }
                        if (form == "мат.плата"){
                                a = "plata";
                        }
                        if (form == "принтер"){
                                a = "printer";
                        }
                        if (form == "ОЗУ"){
                                a = "ram";
                        }
                        if (form == "Сканер"){
                                a = "scaner";
                        }
                        if (form == "программное обеспечение"){
                                a = "soft";
                        }
                        if (form == "видеокарта"){
                                a = "videocard";
                        }
                        if (form == "звуковая карта"){
                                a = "volcard";
                        }
                        if (form == "SSD"){
                                a = "ssd";
                        }

                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("INSERT INTO products (NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                        "values ('" + NameAddPrice.getText() + "', '"+a+"', '" +Float.valueOf(PriceAddPrice.getText())+ "', '" + PrimAddPrice.getText() + "', '" + DopAddPrice.getText() + "')");
                                connection.close();

                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setHeaderText(null);
                                alert.setContentText("Товар добавлен!");
                                alert.showAndWait();

                                dataTable = CP();
                                TableCPUPrice.setItems(dataTable);

                                dataTable1 = Cool();
                                TableCoolerPrice.setItems(dataTable1);

                                dataTable3 = Cab();
                                TableCabeliPrice.setItems(dataTable3);

                                dataTable2 = Corp();
                                TableCorpusPrice.setItems(dataTable2);

                                dataTable5 = FD();
                                TableFDDPrice.setItems(dataTable5);

                                dataTable6 = HD();
                                TableHDDPrice.setItems(dataTable6);

                                dataTable7 = Key();
                                TableKeyboardPrice.setItems(dataTable7);

                                dataTable8 = Plat();
                                TablePlataPrice.setItems(dataTable8);

                                dataTable9 = Mod();
                                TableModemPrice.setItems(dataTable9);

                                dataTable10 = Mon();
                                TableMonitorPrice.setItems(dataTable10);

                                dataTable11 = Mou();
                                TableMousePrice.setItems(dataTable11);

                                dataTable12 = Mic();
                                TableMicrofonPrice.setItems(dataTable12);

                                dataTable13 = Netcard();
                                TableNetworkcardPrice.setItems(dataTable13);

                                dataTable14 = Cov();
                                TableCovrikPrice.setItems(dataTable14);

                                dataTable15 = BPP();
                                TableBPPrice.setItems(dataTable15);

                                dataTable16 = Prin();
                                TablePrinterPrice.setItems(dataTable16);

                                dataTable17 = RA();
                                TableRAMPrice.setItems(dataTable17);

                                dataTable18 = Volcard();
                                TableVolumecardPrice.setItems(dataTable18);

                                dataTable19 = Scan();
                                TableScanerPrice.setItems(dataTable19);

                                dataTable20 = Sof();
                                TableSoftPrice.setItems(dataTable20);

                                dataTable21 = Col();
                                TableColonkiPrice.setItems(dataTable21);

                                dataTable22 = Pit();
                                TablePitaniePrice.setItems(dataTable22);

                                dataTable23 = Vidcard();
                                TableVideocardPrice.setItems(dataTable23);

                                dataTable24 = SSD();
                                TableSDDPrice.setItems(dataTable24);
                        } catch (SQLException e) {
                                throw new RuntimeException("Error while executing SQL query", e);
                        }
                }

                else{
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setHeaderText(null);
                                alert.setContentText("Введите наименование и цену товара!");
                                alert.showAndWait();
                        }

                }


        public void ActionAddButtonCancel(ActionEvent event) {
                BorderPaneAddPrices.setVisible(false);
        }



                @FXML
                void AddButtonCancel(ActionEvent event){

                }
                String form = null;
                @FXML
                void AddButtonPrice(ActionEvent event){



                }
                @FXML
                void ActionAddBPPriceButton(ActionEvent event) {
                        form = "блок питания";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (блок питания)");


                }

                @FXML
                void ActionAddCPUPriceButton(ActionEvent event) {
                        form = "процессор";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (процессор)");
                }

                @FXML
                void ActionAddCabelPriceButton(ActionEvent event) {
                        form = "кабели";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (кабели)");

                }

                @FXML
                void ActionAddColonkiPriceButton(ActionEvent event) {
                        form = "колонки";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (акустические системы)");

                }

                @FXML
                void ActionAddCoolerPriceButton(ActionEvent event) {
                        form = "кулер";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (кулер)");

                }

                @FXML
                void ActionAddCorpusPriceButton(ActionEvent event) {
                        form = "корпус";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (корпус)");

                }

                @FXML
                void ActionAddCovrikPriceButton(ActionEvent event) {
                        form = "коврик";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (коврик)");

                }


                @FXML
                void ActionAddFDDPriceButton(ActionEvent event) {
                        form = "DVD";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (DVD)");

                }

                @FXML
                void ActionAddHDDPriceButton(ActionEvent event) {
                        form = "HDD";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (HDD)");

                }

                @FXML
                void ActionAddKeyboardPriceButton(ActionEvent event) {
                        form = "клавиатура";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (клавиатура)");

                }

                @FXML
                void ActionAddMicrofonPriceButton(ActionEvent event) {
                        form = "микрофон";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (микрофон)");

                }

                @FXML
                void ActionAddModemPriceButton(ActionEvent event) {
                        form = "модем";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (модем)");

                }

                @FXML
                void ActionAddMonitorPriceButton(ActionEvent event) {
                        form = "монитор";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (монитор)");

                }

                @FXML
                void ActionAddMousePriceButton(ActionEvent event) {
                        form = "мышь";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (мышь)");

                }

                @FXML
                void ActionAddNetworkcardPrice(ActionEvent event) {
                        form = "сетевая карта";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (сетевая карта)");

                }

                @FXML
                public void ActionAddOrder(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<AllClients> dataTable25 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM allclients WHERE FIOClient = '" + AllClientsAddOrder.getValue() + "'");
                                while (rs.next()) {
                                        dataTable25.add(new AllClients(rs.getInt("IdClient"), rs.getString("FIOClient"), rs.getString("Contact"),
                                                rs.getString("Commentary"), rs.getString("DataSdachi"), rs.getInt("Predoplatasql")));
                                }

                                connection.close();


                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }



                @FXML
                void ActionAddPitaniePriceButton(ActionEvent event) {
                        form = "источник бесперебойного питания";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (источник бесперебойного питания)");

                }

                @FXML
                void ActionAddPlataPriceButton(ActionEvent event) {
                        form = "мат.плата";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (мат.плата)");

                }

                @FXML
                void ActionAddPrinterPriceButton(ActionEvent event) {
                        form = "принтер";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (принтер)");

                }

                @FXML
                void ActionAddRAMPriceButton(ActionEvent event) {
                        form = "ОЗУ";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (ОЗУ)");

                }

                @FXML
                void ActionAddScanerPriceButton(ActionEvent event) {
                        form = "Сканер";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (сканер)");

                }

                @FXML
                void ActionAddSoftPriceButton(ActionEvent event) {
                        form = "программное обеспечение";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (программное обеспечение)");

                }

                @FXML
                void ActionAddVideocardPriceButton(ActionEvent event) {
                        form = "видеокарта";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (видеокарта)");

                }

                @FXML
                void ActionAddVolumecardPriceButton(ActionEvent event) {
                        form = "звуковая карта";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (звуковая карта)");

                }

                @FXML
                public void ActionBackOrderButton(ActionEvent event) {
                        BorderPaneDatabaseOrder.setVisible(false);
                        BorderPaneMenu.setVisible(true);

                }

                @FXML
                public void ActionBackToMenu(ActionEvent event) {
                        BorderPanePrice.setVisible(false);
                        BorderPaneMenu.setVisible(true);
                }

                @FXML
                public void ActionBackToMenuBPPrice(ActionEvent event) {
                        BorderPaneBPPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuButton(ActionEvent event) {
                        BorderPaneDatabaseOrder.setVisible(false);
                        BorderPaneMenu.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuCPUPrice(ActionEvent event) {

                        BorderPaneCPUPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuColonkiPrice(ActionEvent event) {
                        BorderPaneColonkiPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuCoolerPrice(ActionEvent event) {
                        BorderPaneCoolerPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuCorpusButton(ActionEvent event) {
                        BorderPanePriceCorpus.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuCovrikPrice(ActionEvent event) {
                        BorderPaneCovrikPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuEtcPrice(ActionEvent event) {
                        BorderPaneEtcPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuFDDPrice(ActionEvent event) {
                        BorderPaneFDDPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuHDDPrice(ActionEvent event) {
                        BorderPaneHDDPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuKeyboardPrice(ActionEvent event) {
                        BorderPanePriceKeyboard.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuMicrofonPrice(ActionEvent event) {
                        BorderPaneMicrofonPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuModemPrice(ActionEvent event) {
                        BorderPaneModem.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuMonitor(ActionEvent event) {
                        BorderPaneMonitorPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuMousePrice(ActionEvent event) {
                        BorderPaneMousePrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuNetworkcard(ActionEvent event) {
                        BorderPaneNetworkcardPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionAddSDDPriceButton(ActionEvent event){
                        form = "SSD";
                        BorderPaneAddPrices.setVisible(true);
                        LabelPrice.setText("Добавление прайса (SSD)");


                }
                @FXML
                void ActionDeleteSDDPriceButton(ActionEvent event){
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable24 = SSD();
                                TableSDDPrice.setItems(dataTable24);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionChangeSDDPriceButton(ActionEvent event){

                }

                @FXML
                void ActionFilterSDDPriceButton(ActionEvent event){

                }

                @FXML
                public void ActionBackToMenuSDDPrice(ActionEvent event){
                        BorderPaneSSDPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                void ActionRenewSDDPriceButton(ActionEvent event){
                        dataTable24 = SSD();
                        TableSDDPrice.setItems(dataTable24);

                }

                @FXML
                void ActionSaveSDDPriceButton(ActionEvent event){
                        if (IDSDD.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDSDD.getText() + "','" + SSD.getText() + "', '" + PriceSDD.getText() + "', '" + PrimechanieSDD.getText() + "', '" + DopSDD.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                public void ActionBackToMenuPitaniePrice(ActionEvent event) {
                        BorderPanePitaniePrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuPlataPrice(ActionEvent event) {
                        BorderPlataPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuPriceCabeli(ActionEvent event) {
                        BorderPaneCabelPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuPrinterPrice(ActionEvent event) {
                        BorderPanePrinterPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuRAMPrice(ActionEvent event) {
                        BorderPaneRAMPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuScanerPrice(ActionEvent event) {
                        BorderPaneScanerPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuSoftPrice(ActionEvent event) {
                        BorderPaneSoftPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuVideocardPrice(ActionEvent event) {
                        BorderPaneVideocardPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionBackToMenuVolumecard(ActionEvent event) {
                        BorderPaneVolumecardPrice.setVisible(false);
                        BorderPanePrice.setVisible(true);

                }

                @FXML
                public void ActionCancelAddOrder(ActionEvent event) {
                        BorderPaneAddOrder.setVisible(false);
                        RaschetBorderPane.setVisible(true);

                }

                @FXML
                void ActionCorrectPrintOrder(ActionEvent event) {

                }

                @FXML
                public void ActionCorrectingOrdersButton(ActionEvent event) {
                        BorderPaneMenu.setVisible(false);
                        CorrectBorderPane.setVisible(true);
                }

                @FXML
                public void ActionDatabaseOrder(ActionEvent event) {
                        BorderPaneMenu.setVisible(false);
                        BorderPaneDatabaseOrder.setVisible(true);
                }

                @FXML
                void ActionDeleteBPPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable15 = BPP();
                                TableBPPrice.setItems(dataTable15);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteCPUPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable = CP();
                                TableCPUPrice.setItems(dataTable);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteCabelPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable3 = Cab();
                                TableCabeliPrice.setItems(dataTable3);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteColonkiPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable21 = Col();
                                TableColonkiPrice.setItems(dataTable21);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteCoolerPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable1 = Cool();
                                TableCoolerPrice.setItems(dataTable1);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteCorpusPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable2 = Corp();
                                TableCorpusPrice.setItems(dataTable2);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteCorrectOrderButton(ActionEvent event) {

                }

                @FXML
                void ActionDeleteCovrikPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable14 = Cov();
                                TableCovrikPrice.setItems(dataTable14);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }


                @FXML
                void ActionDeleteFDDPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable5 = FD();
                                TableFDDPrice.setItems(dataTable5);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteHDDPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable6 = HD();
                                TableHDDPrice.setItems(dataTable6);
                                System.out.println(id);

                        }
                        catch (SQLException e){
                                System.out.println("12");
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteKeyboardPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable7 = Key();
                                TableKeyboardPrice.setItems(dataTable7);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteMicrofonPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable12 = Mic();
                                TableMicrofonPrice.setItems(dataTable12);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteModemPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable9 = Mod();
                                TableModemPrice.setItems(dataTable9);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteMonitorPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable10 = Mon();
                                TableMonitorPrice.setItems(dataTable10);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteMousePriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable11 = Mou();
                                TableMousePrice.setItems(dataTable11);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteNetworkcard(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable13 = Netcard();
                                TableNetworkcardPrice.setItems(dataTable13);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeletePitaniePriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable22 = Pit();
                                TablePitaniePrice.setItems(dataTable22);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeletePlataPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable8 = Plat();
                                TablePlataPrice.setItems(dataTable8);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeletePrinterPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable16 = Prin();
                                TablePrinterPrice.setItems(dataTable16);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteRAMPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable17 = RA();
                                TableRAMPrice.setItems(dataTable17);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteScanerPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable19 = Scan();
                                TableScanerPrice.setItems(dataTable19);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteSoftPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable20 = Sof();
                                TableSoftPrice.setItems(dataTable20);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteVideocardPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable23 = Vidcard();
                                TableVideocardPrice.setItems(dataTable23);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                void ActionDeleteVolumecardPriceButton(ActionEvent event) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                statement.executeUpdate("DELETE FROM products WHERE IDProduct= "+id+";");
                                connection.close();
                                dataTable18 = Volcard();
                                TableVolumecardPrice.setItems(dataTable18);
                        }
                        catch (SQLException e){
                                throw new RuntimeException("Error while executing SQL query", e);
                        }

                }

                @FXML
                public void ActionEnterToBase(ActionEvent event) {
                        String a = null;
                        String b = null;


                        try{
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                Statement statement = connection.createStatement();
                                a = "SELECT * FROM login WHERE Username ='"+LoginText.getText()+"' AND Password ="+PasswordText.getText()+";";
                                ResultSet resultSet = statement.executeQuery(a);
                                if (resultSet.next()){
                                        LoginBorderPane.setVisible(false);
                                        BorderPaneMenu.setVisible(true);
                                }
                                else{
                                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                        alert.setTitle("Ошибка");
                                        alert.setHeaderText(null);
                                        alert.setContentText("Неправильные данные!");

                                        alert.showAndWait();
                                }

                        } catch (SQLException e) {
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("Ошибка");
                                alert.setHeaderText(null);
                                alert.setContentText("Введите данные!");

                                alert.showAndWait();
                        }

                }

                @FXML
                public void ActionExit(ActionEvent event) {
                        Stage stage = (Stage) Exit.getScene().getWindow();
                        stage.close();
                }

                @FXML
                public void ActionExitMenu(ActionEvent event) {
                        Stage stage = (Stage) Exit.getScene().getWindow();
                        stage.close();

                }

                @FXML
                void ActionExitToMenu(ActionEvent event) {
                        ExitToMenu.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event) {
                                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                                        alert.setHeaderText(null);
                                        alert.initModality(Modality.APPLICATION_MODAL);
                                        alert.setContentText("Подтвердите выход!");
                                        Optional<ButtonType> result = alert.showAndWait();
                                        if (result.get() == ButtonType.OK){
                                                RaschetBorderPane.setVisible(false);
                                                BorderPaneMenu.setVisible(true);
                                                comboBox1.clear();
                                                comboBox2.clear();
                                                comboBox3.clear();
                                                comboBox4.clear();
                                                comboBox5.clear();
                                                comboBox6.clear();
                                                comboBox7.clear();
                                                comboBox8.clear();
                                                comboBox9.clear();
                                                comboBox10.clear();
                                                comboBox11.clear();
                                                comboBox12.clear();
                                                comboBox13.clear();
                                                comboBox14.clear();
                                                comboBox15.clear();
                                                comboBox16.clear();
                                                comboBox17.clear();
                                                comboBox18.clear();
                                                comboBox19.clear();
                                                comboBox20.clear();
                                                comboBox21.clear();
                                                comboBox22.clear();
                                                comboBox23.clear();
                                                comboBox24.clear();
                                                comboBox25.clear();

                                                PriceCPUField.setText("0");
                                                PriceCoolerField.setText("0");
                                                PriceHDDField.setText("0");
                                                PricePlataField.setText("0");
                                                PriceRAMField.setText("0");
                                                PriceVideocardField.setText("0");
                                                PriceSSDField.setText("0");
                                                PriceCorpusField.setText("0");
                                                PriceMonitorField.setText("0");
                                                PriceVolumecardField.setText("0");
                                                PriceMicrofonField.setText("0");
                                                PriceColonkiField.setText("0");
                                                PriceKeyboardField.setText("0");
                                                PriceMouseField.setText("0");
                                                PriceCovrikField.setText("0");
                                                PricePrinterField.setText("0");
                                                PriceScanerField.setText("0");
                                                PriceBPField.setText("0");
                                                PricePitanieField.setText("0");
                                                PriceNetworkcardField.setText("0");
                                                PriceModemField.setText("0");
                                                PriceDopcabeliField.setText("0");
                                                PriceSoftField.setText("0");
                                                PriceFDDField.setText("0");
                                                PriceEtcField.setText("0");
                                                RaschetEtcTextField.setText("");
                                                RaschetColvo.setText("1");
                                                RaschetItogo.setText("0");
                                                RaschetSumm.setText("");
                                        }
                                        else if (result.get() == ButtonType.CANCEL){
                                                alert.close();
                                        }
                                }
                        });




                }

                @FXML
                void ActionExitToMenuButton1(ActionEvent event) {

                }



                String a = null;
                @FXML
                public void ActionNamePriceField(ActionEvent event) {
                        a = NamePriceField.getValue();

                        switch(a){
                                case "Процессор":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneCPUPrice.setVisible(true);
                                        break;
                                case "Кулер":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneCoolerPrice.setVisible(true);
                                        break;
                                case "Корпус":
                                        BorderPanePrice.setVisible(false);
                                        BorderPanePriceCorpus.setVisible(true);
                                        break;
                                case "Видеокарта":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneVideocardPrice.setVisible(true);
                                        break;
                                case "ОЗУ":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneRAMPrice.setVisible(true);
                                        break;
                                case "Акустические системы":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneColonkiPrice.setVisible(true);
                                        break;
                                case "Источник бесперебойного питания":
                                        BorderPanePrice.setVisible(false);
                                        BorderPanePitaniePrice.setVisible(true);
                                        break;
                                case "Кабели":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneCabelPrice.setVisible(true);
                                        break;
                                case "Мышь":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneMousePrice.setVisible(true);
                                        break;
                                case "Клавиатура":
                                        BorderPanePrice.setVisible(false);
                                        BorderPanePriceKeyboard.setVisible(true);
                                        break;
                                case "Микрофон":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneMicrofonPrice.setVisible(true);
                                        break;
                                case "Модем":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneModem.setVisible(true);
                                        break;
                                case "Материнская плата":
                                        BorderPanePrice.setVisible(false);
                                        BorderPlataPrice.setVisible(true);
                                        break;
                                case "Жесткий диск HDD":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneHDDPrice.setVisible(true);
                                        break;
                                case "SSD диск":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneSSDPrice.setVisible(true);
                                        break;
                                case "DVD":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneFDDPrice.setVisible(true);
                                        break;
                                case "Звуковая карта":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneVolumecardPrice.setVisible(true);
                                        break;
                                case "Коврик":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneCovrikPrice.setVisible(true);
                                        break;
                                case "Принтер":
                                        BorderPanePrice.setVisible(false);
                                        BorderPanePrinterPrice.setVisible(true);
                                        break;
                                case "Сканер":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneScanerPrice.setVisible(true);
                                        break;
                                case "Блок питания":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneBPPrice.setVisible(true);
                                        break;
                                case "Программное обеспечение":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneSoftPrice.setVisible(true);
                                        break;
                                case "Монитор":
                                        BorderPanePrice.setVisible(false);
                                        BorderPaneMonitorPrice.setVisible(true);
                                        break;
                        }
                        NamePriceField.getSelectionModel().select("");

                }

                @FXML
                private void initialize() {
                        RaschetEtcTextArea.setWrapText(true);
                        CommAddOrder.setWrapText(true);
                        ContactAddOrder.setWrapText(true);

                        RaschetColvo.setText("1");
                        dataTable25 = ClientOrder();
                        RaschetDataVipiski.setValue(LocalDate.now());
                        DataSdachiAddOrder.setValue(LocalDate.now());
                        RaschetFormOplati.getItems().addAll("Нал.", "Безнал.");
                        NamePriceField.getItems().addAll("Процессор", "Кулер", "Корпус", "Видеокарта", "ОЗУ", "Акустические системы", "Источник бесперебойного питания",
                                "Кабели", "Мышь", "Клавиатура", "Микрофон", "Модем", "Материнская плата", "Жесткий диск HDD", "SSD диск", "DVD", "Звуковая карта", "Коврик",
                                "Принтер", "Сканер", "Блок питания", "Программное обеспечение", "Монитор");


                        TableCPUPrice.setEditable(true);
                        TableCPUPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableCoolerPrice.setEditable(true);
                        TableCoolerPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableCabeliPrice.setEditable(true);
                        TableCabeliPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableCorpusPrice.setEditable(true);
                        TableCorpusPrice.getSelectionModel().setCellSelectionEnabled(true);



                        TableFDDPrice.setEditable(true);
                        TableFDDPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableHDDPrice.setEditable(true);
                        TableHDDPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableKeyboardPrice.setEditable(true);
                        TableKeyboardPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TablePlataPrice.setEditable(true);
                        TablePlataPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableModemPrice.setEditable(true);
                        TableModemPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableMonitorPrice.setEditable(true);
                        TableMonitorPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableMousePrice.setEditable(true);
                        TableMousePrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableMicrofonPrice.setEditable(true);
                        TableMicrofonPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableNetworkcardPrice.setEditable(true);
                        TableNetworkcardPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableCovrikPrice.setEditable(true);
                        TableCovrikPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableBPPrice.setEditable(true);
                        TableBPPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TablePrinterPrice.setEditable(true);
                        TablePrinterPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableRAMPrice.setEditable(true);
                        TableRAMPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableVolumecardPrice.setEditable(true);
                        TableVolumecardPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableScanerPrice.setEditable(true);
                        TableScanerPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableSoftPrice.setEditable(true);
                        TableSoftPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableColonkiPrice.setEditable(true);
                        TableColonkiPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TablePitaniePrice.setEditable(true);
                        TablePitaniePrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableVideocardPrice.setEditable(true);
                        TableVideocardPrice.getSelectionModel().setCellSelectionEnabled(true);

                        TableSDDPrice.setEditable(true);
                        TableSDDPrice.getSelectionModel().setCellSelectionEnabled(true);


                        IDCPU.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        CPU.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceCPU.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieCPU.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopCPU.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable = CP();
                        TableCPUPrice.setItems(dataTable);

                        IDCooler.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Cooler.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceCooler.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimexhanieCooler.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopCooler.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable1 = Cool();
                        TableCoolerPrice.setItems(dataTable1);

                        IDCabeli.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Cabel.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceCabel.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieCabel.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopCabel.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable3 = Cab();
                        TableCabeliPrice.setItems(dataTable3);

                        IDCorpus.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Corpus.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceCorpus.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieCorpus.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopCorpus.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable2 = Corp();
                        TableCorpusPrice.setItems(dataTable2);

                        IDFDD.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        FDD.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceFDD.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieFDD.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopFDD.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable5 = FD();
                        TableFDDPrice.setItems(dataTable5);

                        IDHDD.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        HDD.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceHDD.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieHDD.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopHDD.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable6 = HD();
                        TableHDDPrice.setItems(dataTable6);

                        IDKeyboard.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Keyboard.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceKeyboard.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieKeyboard.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopKeyboard.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable7 = Key();
                        TableKeyboardPrice.setItems(dataTable7);

                        IDPlata.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Plata.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PlataPrice.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechaniePrice.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopPrice.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable8 = Plat();
                        TablePlataPrice.setItems(dataTable8);

                        IDModem.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Modem.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PrideModem.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieModem.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopModem.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable9 = Mod();
                        TableModemPrice.setItems(dataTable9);

                        IDMonitor.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Monitor.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        MonitorPrice.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieMonitor.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopMonitor.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable10 = Mon();
                        TableMonitorPrice.setItems(dataTable10);

                        IDMouse.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Mouse.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceMouse.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieMouse.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopMouse.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable11 = Mou();
                        TableMousePrice.setItems(dataTable11);

                        IDMicrofon.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Microfon.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceMicrofon.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieMicrofon.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopMicrofon.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable12 = Mic();
                        TableMicrofonPrice.setItems(dataTable12);

                        IDNetworkcard.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Networkcard.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceNetworkcard.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieNetworkcard.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopNetworkcard.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable13 = Netcard();
                        TableNetworkcardPrice.setItems(dataTable13);

                        IDCovrik.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Covrik.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceCovrik.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieCovrik.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopCovrik.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable14 = Cov();
                        TableCovrikPrice.setItems(dataTable14);

                        IDBP.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        BP.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceBP.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieBP.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopBP.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable15 = BPP();
                        TableBPPrice.setItems(dataTable15);

                        IDPrinter.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Printer.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PricePrinter.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechaniePrinter.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopPrinter.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable16 = Prin();
                        TablePrinterPrice.setItems(dataTable16);

                        IDRAM.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        RAM.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceRAM.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieRAM.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopRAM.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable17 = RA();
                        TableRAMPrice.setItems(dataTable17);

                        IDVolumecard.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Volumecard.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceVolumecard.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieVolumecard.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopVolumecard.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable18 = Volcard();
                        TableVolumecardPrice.setItems(dataTable18);

                        IDScaner.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Scaner.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceScaner.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieScaner.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopScaner.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable19 = Scan();
                        TableScanerPrice.setItems(dataTable19);

                        IDSoft.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Soft.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceSoft.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieSoft.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopSoft.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable20 = Sof();
                        TableSoftPrice.setItems(dataTable20);

                        IDColonki.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Colonki.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceColonki.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieColonki.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopColonki.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable21 = Col();
                        TableColonkiPrice.setItems(dataTable21);

                        IDPitanie.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Pitanie.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PricePitanie.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechaniePitanie.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopPitanie.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable22 = Pit();
                        TablePitaniePrice.setItems(dataTable22);

                        IDVideocard.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        Videocard.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceVideocard.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieVideocard.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopVideocard.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable23 = Vidcard();
                        TableVideocardPrice.setItems(dataTable23);

                        IDSDD.setCellValueFactory(new PropertyValueFactory<CPUTable, Integer>("IDCPU"));
                        SSD.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("CPU"));
                        PriceSDD.setCellValueFactory(new PropertyValueFactory<CPUTable, Float>("PriceCPU"));
                        PrimechanieSDD.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("PrimechanieCPU"));
                        DopSDD.setCellValueFactory(new PropertyValueFactory<CPUTable, String>("DopCPU"));
                        dataTable24 = SSD();
                        TableSDDPrice.setItems(dataTable24);



                        try {
                                CPU.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceCPU.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieCPU.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopCPU.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                CPU.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                        });
                                PriceCPU.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                        });
                                PrimechanieCPU.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                        });
                                DopCPU.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                        });

                                Cooler.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceCooler.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimexhanieCooler.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopCooler.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Cooler.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceCooler.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimexhanieCooler.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopCooler.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Cabel.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceCabel.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieCabel.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopCabel.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Cabel.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceCabel.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieCabel.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopCabel.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Corpus.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceCorpus.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieCorpus.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopCorpus.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Corpus.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceCorpus.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieCorpus.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopCorpus.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

//                                Etc.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
//                                PriceEtc.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
//                                PrimechanieEtc.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
//                                DopEtc.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
//
//                                Etc.setOnEditCommit(event ->  {
//                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
//                                        cpuTable.setCPU(event.getNewValue());
//                                });
//                                PriceEtc.setOnEditCommit(event -> {
//                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
//                                        cpuTable.setPriceCPU(event.getNewValue());
//                                });
//                                PrimechanieEtc.setOnEditCommit(event ->  {
//                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
//                                        cpuTable.setPrimechanieCPU(event.getNewValue());
//                                });
//                                DopEtc.setOnEditCommit(event ->  {
//                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
//                                        cpuTable.setDopCPU(event.getNewValue());
//                                });

                                FDD.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceFDD.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieFDD.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopFDD.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                FDD.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceFDD.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieFDD.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopFDD.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                HDD.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceHDD.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieHDD.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopHDD.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                HDD.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceHDD.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieHDD.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopHDD.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Keyboard.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceKeyboard.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieKeyboard.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopKeyboard.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Keyboard.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceKeyboard.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieKeyboard.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopKeyboard.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Plata.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PlataPrice.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechaniePrice.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopPrice.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Plata.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PlataPrice.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechaniePrice.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopPrice.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Modem.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PrideModem.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieModem.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopModem.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Modem.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PrideModem.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieModem.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopModem.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Monitor.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                MonitorPrice.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieMonitor.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopMonitor.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Monitor.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                MonitorPrice.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieMonitor.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopMonitor.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Mouse.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceMouse.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieMouse.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopMouse.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Mouse.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceMouse.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieMouse.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopMouse.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Microfon.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceMicrofon.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieMicrofon.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopMicrofon.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Microfon.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceMicrofon.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieMicrofon.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopMicrofon.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Networkcard.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceNetworkcard.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieNetworkcard.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopNetworkcard.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Networkcard.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceNetworkcard.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieNetworkcard.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopNetworkcard.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Covrik.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceCovrik.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieCovrik.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopCovrik.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Covrik.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceCovrik.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieCovrik.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopCovrik.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                BP.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceBP.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieBP.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopBP.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                BP.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceBP.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieBP.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopBP.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Printer.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PricePrinter.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechaniePrinter.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopPrinter.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Printer.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PricePrinter.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechaniePrinter.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopPrinter.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                RAM.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceRAM.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieRAM.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopRAM.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                RAM.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceRAM.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieRAM.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopRAM.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Volumecard.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceVolumecard.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieVolumecard.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopVolumecard.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Volumecard.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceVolumecard.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieVolumecard.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopVolumecard.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Scaner.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceScaner.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieScaner.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopScaner.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Scaner.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceScaner.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieScaner.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopScaner.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Soft.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceSoft.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieSoft.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopSoft.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Soft.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceSoft.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieSoft.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopSoft.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Colonki.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceColonki.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieColonki.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopColonki.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Colonki.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceColonki.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieColonki.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopColonki.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Pitanie.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PricePitanie.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechaniePitanie.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopPitanie.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Pitanie.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PricePitanie.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechaniePitanie.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopPitanie.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                Videocard.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceVideocard.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieVideocard.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopVideocard.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                Videocard.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceVideocard.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieVideocard.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopVideocard.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                                SSD.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                PriceSDD.setCellFactory(TextFieldTableCell.<CPUTable, Float>forTableColumn(new FloatStringConverter()));
                                PrimechanieSDD.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());
                                DopSDD.setCellFactory(TextFieldTableCell.<CPUTable>forTableColumn());

                                SSD.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setCPU(event.getNewValue());
                                });
                                PriceSDD.setOnEditCommit(event -> {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPriceCPU(event.getNewValue());
                                });
                                PrimechanieSDD.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setPrimechanieCPU(event.getNewValue());
                                });
                                DopSDD.setOnEditCommit(event ->  {
                                        CPUTable cpuTable = event.getTableView().getItems().get(event.getTablePosition().getRow());
                                        cpuTable.setDopCPU(event.getNewValue());
                                });

                        }
                        catch (Exception e){
                                System.out.println(e);
                        }


                }

                @FXML
                public void ActionPriceButton(ActionEvent event) {
                        BorderPaneMenu.setVisible(false);
                        BorderPanePrice.setVisible(true);
                }

        ObservableList<String> comboBox1 = FXCollections.observableArrayList();
        ObservableList<String> comboBox2 = FXCollections.observableArrayList();
        ObservableList<String> comboBox3 = FXCollections.observableArrayList();
        ObservableList<String> comboBox4 = FXCollections.observableArrayList();
        ObservableList<String> comboBox5 = FXCollections.observableArrayList();
        ObservableList<String> comboBox6 = FXCollections.observableArrayList();
        ObservableList<String> comboBox7 = FXCollections.observableArrayList();
        ObservableList<String> comboBox8 = FXCollections.observableArrayList();
        ObservableList<String> comboBox9 = FXCollections.observableArrayList();
        ObservableList<String> comboBox10 = FXCollections.observableArrayList();
        ObservableList<String> comboBox11 = FXCollections.observableArrayList();
        ObservableList<String> comboBox12 = FXCollections.observableArrayList();
        ObservableList<String> comboBox13 = FXCollections.observableArrayList();
        ObservableList<String> comboBox14 = FXCollections.observableArrayList();
        ObservableList<String> comboBox15 = FXCollections.observableArrayList();
        ObservableList<String> comboBox16 = FXCollections.observableArrayList();
        ObservableList<String> comboBox17 = FXCollections.observableArrayList();
        ObservableList<String> comboBox18 = FXCollections.observableArrayList();
        ObservableList<String> comboBox19 = FXCollections.observableArrayList();
        ObservableList<String> comboBox20 = FXCollections.observableArrayList();
        ObservableList<String> comboBox21 = FXCollections.observableArrayList();
        ObservableList<String> comboBox22 = FXCollections.observableArrayList();
        ObservableList<String> comboBox23 = FXCollections.observableArrayList();
        ObservableList<String> comboBox24 = FXCollections.observableArrayList();
        ObservableList<String> comboBox25 = FXCollections.observableArrayList();

        ObservableList<String> comboBox26 = FXCollections.observableArrayList();



                @FXML
                public void ActionRaschetButton(ActionEvent event) {
                        BorderPaneMenu.setVisible(false);
                        RaschetBorderPane.setVisible(true);
                        PriceCPUField.setText("0");
                        PriceCoolerField.setText("0");
                        PriceHDDField.setText("0");
                        PricePlataField.setText("0");
                        PriceRAMField.setText("0");
                        PriceVideocardField.setText("0");
                        PriceSSDField.setText("0");
                        PriceCorpusField.setText("0");
                        PriceMonitorField.setText("0");
                        PriceVolumecardField.setText("0");
                        PriceMicrofonField.setText("0");
                        PriceColonkiField.setText("0");
                        PriceKeyboardField.setText("0");
                        PriceMouseField.setText("0");
                        PriceCovrikField.setText("0");
                        PricePrinterField.setText("0");
                        PriceScanerField.setText("0");
                        PriceBPField.setText("0");
                        PricePitanieField.setText("0");
                        PriceNetworkcardField.setText("0");
                        PriceModemField.setText("0");
                        PriceDopcabeliField.setText("0");
                        PriceSoftField.setText("0");
                        PriceFDDField.setText("0");
                        PriceEtcField.setText("0");
                        RaschetItogo.setText("0");

                        comboBox1.add("");
                        for (int i = 0; i < dataTable.size(); i++){
                                comboBox1.add(dataTable.get(i).getCPU());
                        }
                        RaschetCPUField.setItems(comboBox1);

                        comboBox2.add("");
                        for (int i = 0; i < dataTable1.size(); i++){
                                comboBox2.add(dataTable1.get(i).getCPU());
                        }
                        RaschetCoolerField.setItems(comboBox2);

                        comboBox3.add("");
                        for (int i = 0; i < dataTable2.size(); i++){
                                comboBox3.add(dataTable2.get(i).getCPU());
                        }
                        RaschetCorpusField.setItems(comboBox3);

                        comboBox4.add("");
                        for (int i = 0; i < dataTable3.size(); i++){
                                comboBox4.add(dataTable3.get(i).getCPU());
                        }
                        RaschetDopcabeliField.setItems(comboBox4);

                        comboBox5.add("");
                        for (int i = 0; i < dataTable4.size(); i++){
                                comboBox5.add(dataTable4.get(i).getCPU());
                        }
//                        RaschetEtcField.setItems(comboBox5);
//                        for (int i = 0; i < dataTable5.size(); i++){
//                                comboBox6.add(dataTable5.get(i).getCPU());
//                        }
                        comboBox6.add("");
                        for (int i = 0; i < dataTable5.size(); i++){
                                comboBox6.add(dataTable5.get(i).getCPU());
                                System.out.println(dataTable5.get(i).getCPU());
                        }
                        RaschetFDDField.setItems(comboBox6);

                        comboBox7.add("");
                        for (int i = 0; i < dataTable6.size(); i++){
                                comboBox7.add(dataTable6.get(i).getCPU());
                                System.out.println(dataTable6.get(i).getCPU());
                        }
                        RaschetHDDField.setItems(comboBox7);

                        comboBox8.add("");
                        for (int i = 0; i < dataTable7.size(); i++){
                                comboBox8.add(dataTable7.get(i).getCPU());

                        }
                        RaschetKeyboardField.setItems(comboBox8);

                        comboBox9.add("");
                        for (int i = 0; i < dataTable8.size(); i++){
                                comboBox9.add(dataTable8.get(i).getCPU());
                        }
                        RaschetPlataField.setItems(comboBox9);

                        comboBox10.add("");
                        for (int i = 0; i < dataTable9.size(); i++){
                                comboBox10.add(dataTable9.get(i).getCPU());
                        }
                        RaschetModemField.setItems(comboBox10);

                        comboBox11.add("");
                        for (int i = 0; i < dataTable10.size(); i++){
                                comboBox11.add(dataTable10.get(i).getCPU());
                        }
                        RaschetMonitorField.setItems(comboBox11);

                        comboBox12.add("");
                        for (int i = 0; i < dataTable11.size(); i++){
                                comboBox12.add(dataTable11.get(i).getCPU());
                        }
                        RaschetMouseField.setItems(comboBox12);

                        comboBox13.add("");
                        for (int i = 0; i < dataTable12.size(); i++){
                                comboBox13.add(dataTable12.get(i).getCPU());
                        }
                        RaschetMicrofonField.setItems(comboBox13);

                        comboBox14.add("");
                        for (int i = 0; i < dataTable13.size(); i++){
                                comboBox14.add(dataTable13.get(i).getCPU());
                        }
                        RaschetNetworkcardField.setItems(comboBox14);

                        comboBox15.add("");
                        for (int i = 0; i < dataTable14.size(); i++){
                                comboBox15.add(dataTable14.get(i).getCPU());
                        }
                        RaschetCovrikField.setItems(comboBox15);

                        comboBox16.add("");
                        for (int i = 0; i < dataTable15.size(); i++){
                                comboBox16.add(dataTable15.get(i).getCPU());
                        }
                        RaschetBPField.setItems(comboBox16);

                        comboBox17.add("");
                        for (int i = 0; i < dataTable16.size(); i++){
                                comboBox17.add(dataTable16.get(i).getCPU());
                        }
                        RaschetPrinterField.setItems(comboBox17);

                        comboBox18.add("");
                        for (int i = 0; i < dataTable17.size(); i++){
                                comboBox18.add(dataTable17.get(i).getCPU());
                        }
                        RaschetRAMField.setItems(comboBox18);

                        comboBox19.add("");
                        for (int i = 0; i < dataTable18.size(); i++){
                                comboBox19.add(dataTable18.get(i).getCPU());
                        }
                        RaschetVolumecardField.setItems(comboBox19);

                        comboBox20.add("");
                        for (int i = 0; i < dataTable19.size(); i++){
                                comboBox20.add(dataTable19.get(i).getCPU());
                        }
                        RaschetScanerField.setItems(comboBox20);

                        comboBox21.add("");
                        for (int i = 0; i < dataTable20.size(); i++){
                                comboBox21.add(dataTable20.get(i).getCPU());
                        }
                        RaschetSoftField.setItems(comboBox21);

                        comboBox22.add("");
                        for (int i = 0; i < dataTable21.size(); i++){
                                comboBox22.add(dataTable21.get(i).getCPU());
                        }
                        RaschetColonkiField.setItems(comboBox22);

                        comboBox23.add("");
                        for (int i = 0; i < dataTable22.size(); i++){
                                comboBox23.add(dataTable22.get(i).getCPU());
                        }
                        RaschetPitanieField.setItems(comboBox23);

                        comboBox24.add("");
                        for (int i = 0; i < dataTable23.size(); i++){
                                comboBox24.add(dataTable23.get(i).getCPU());
                        }
                        RaschetVideocardField.setItems(comboBox24);

                        comboBox25.add("");
                        for (int i = 0; i < dataTable24.size(); i++){
                                comboBox25.add(dataTable24.get(i).getCPU());
                        }
                        RaschetSSDField.setItems(comboBox25);

                        comboBox26.add("");
                        for (int i = 0; i < dataTable25.size(); i++){
                                comboBox26.add(dataTable25.get(i).getFIOClient());
                        }
                        AllClientsAddOrder.setItems(comboBox26);
                        new AutoCompleteComboBoxListener<>(AllClientsAddOrder);
                }

                @FXML
                public void ActionRaschetPrint(ActionEvent event) {
                        RaschetPrinterPdfClass.printorder(RaschetCPUField.getValue(), RaschetCoolerField.getValue(), RaschetHDDField.getValue(), RaschetPlataField.getValue(), RaschetRAMField.getValue(),
                                RaschetVideocardField.getValue(), RaschetSSDField.getValue(), RaschetCorpusField.getValue(), RaschetMonitorField.getValue(), RaschetVolumecardField.getValue(), RaschetMicrofonField.getValue(),
                                RaschetColonkiField.getValue(), RaschetKeyboardField.getValue(), RaschetMouseField.getValue(), RaschetCovrikField.getValue(), RaschetPrinterField.getValue(), RaschetScanerField.getValue(),
                                RaschetBPField.getValue(), RaschetPitanieField.getValue(), RaschetNetworkcardField.getValue(), RaschetModemField.getValue(), RaschetDopcabeliField.getValue(), RaschetSoftField.getValue(), RaschetFDDField.getValue(),
                                RaschetEtcTextArea.getText(), RaschetSumm.getText(), RaschetColvo.getText(), RaschetItogo.getText(), Float.parseFloat(PriceCPUField.getText()), Float.parseFloat(PriceCoolerField.getText()), Float.parseFloat(PriceHDDField.getText()),
                                Float.parseFloat(PricePlataField.getText()), Float.parseFloat(PriceRAMField.getText()), Float.parseFloat(PriceVideocardField.getText()), Float.parseFloat(PriceSSDField.getText()), Float.parseFloat(PriceCorpusField.getText()),
                                Float.parseFloat(PriceMonitorField.getText()), Float.parseFloat(PriceVolumecardField.getText()),
                                Float.parseFloat(PriceMicrofonField.getText()), Float.parseFloat(PriceColonkiField.getText()), Float.parseFloat(PriceKeyboardField.getText()), Float.parseFloat(PriceMouseField.getText()), Float.parseFloat(PriceCovrikField.getText()), Float.parseFloat(PricePrinterField.getText()),
                                Float.parseFloat(PriceScanerField.getText()), Float.parseFloat(PriceBPField.getText()), Float.parseFloat(PricePitanieField.getText()), Float.parseFloat(PriceNetworkcardField.getText()), Float.parseFloat(PriceModemField.getText()), Float.parseFloat(PriceDopcabeliField.getText()),
                                Float.parseFloat(PriceSoftField.getText()), Float.parseFloat(PriceFDDField.getText()), Float.parseFloat(PriceEtcField.getText()));
                        RaschetPrinterPdfClass.openPdf("OrderRaschet.pdf");
                }

                @FXML
                void ActionRenewBPPriceButton(ActionEvent event) {
                        dataTable15 = BPP();
                        TableBPPrice.setItems(dataTable15);

                }

                @FXML
                void ActionRenewCPUPriceButton(ActionEvent event) {
                        dataTable = CP();
                        TableCPUPrice.setItems(dataTable);

                }

                @FXML
                void ActionRenewCabelPriceButton(ActionEvent event) {
                        dataTable3 = Cab();
                        TableCabeliPrice.setItems(dataTable3);

                }

                @FXML
                void ActionRenewColonkiPriceButton(ActionEvent event) {
                        dataTable21 = Col();
                        TableColonkiPrice.setItems(dataTable21);

                }

                @FXML
                void ActionRenewCoolerPriceButton(ActionEvent event) {
                        dataTable1 = Cool();
                        TableCoolerPrice.setItems(dataTable1);

                }

                @FXML
                void ActionRenewCorpusPriceButton(ActionEvent event) {
                        dataTable2 = Corp();
                        TableCorpusPrice.setItems(dataTable2);

                }

                @FXML
                void ActionRenewCovrikPriceButton(ActionEvent event) {
                        dataTable14 = Cov();
                        TableCovrikPrice.setItems(dataTable14);

                }



                @FXML
                void ActionRenewFDDPriceButton(ActionEvent event) {
                        dataTable5 = FD();
                        TableFDDPrice.setItems(dataTable5);

                }

                @FXML
                void ActionRenewHDDPriceButton(ActionEvent event) {
                        dataTable6 = HD();
                        TableHDDPrice.setItems(dataTable6);

                }

                @FXML
                void ActionRenewKeyboardPriceButton(ActionEvent event) {
                        dataTable7 = Key();
                        TableKeyboardPrice.setItems(dataTable7);

                }

                @FXML
                void ActionRenewMicrofonPriceButton(ActionEvent event) {
                        dataTable12 = Mic();
                        TableMicrofonPrice.setItems(dataTable12);

                }

                @FXML
                void ActionRenewModemPriceButton(ActionEvent event) {
                        dataTable9 = Mod();
                        TableModemPrice.setItems(dataTable9);

                }

                @FXML
                void ActionRenewMonitorPriceButton(ActionEvent event) {
                        dataTable10 = Mon();
                        TableMonitorPrice.setItems(dataTable10);

                }

                @FXML
                void ActionRenewMousePriceButton(ActionEvent event) {
                        dataTable11 = Mou();
                        TableMousePrice.setItems(dataTable11);

                }

                @FXML
                void ActionRenewNetworkcardPriceButton(ActionEvent event) {
                        dataTable13 = Netcard();
                        TableNetworkcardPrice.setItems(dataTable13);

                }

                @FXML
                void ActionRenewPitaniePriceButton(ActionEvent event) {
                        dataTable22 = Pit();
                        TablePitaniePrice.setItems(dataTable22);

                }

                @FXML
                void ActionRenewPlataPriceButton(ActionEvent event) {
                        dataTable8 = Plat();
                        TablePlataPrice.setItems(dataTable8);

                }

                @FXML
                void ActionRenewPrinterPriceButton(ActionEvent event) {
                        dataTable16 = Prin();
                        TablePrinterPrice.setItems(dataTable16);

                }

                @FXML
                void ActionRenewRAMPriceButton(ActionEvent event) {
                        dataTable17 = RA();
                        TableRAMPrice.setItems(dataTable17);

                }

                @FXML
                void ActionRenewScanerPriceButton(ActionEvent event) {
                        dataTable19 = Scan();
                        TableScanerPrice.setItems(dataTable19);

                }

                @FXML
                void ActionRenewSoftPriceButton(ActionEvent event) {
                        dataTable20 = Sof();
                        TableSoftPrice.setItems(dataTable20);

                }

                @FXML
                void ActionRenewVideocardPriceButton(ActionEvent event) {
                        dataTable23 = Vidcard();
                        TableVideocardPrice.setItems(dataTable23);

                }

                @FXML
                void ActionRenewVolumecardPriceButton(ActionEvent event) {
                        dataTable18 = Volcard();
                        TableVolumecardPrice.setItems(dataTable18);

                }

                @FXML
                void ActionSaveBPPriceButton(ActionEvent event) {
                        if (IDBP.getText().isEmpty()){
                                try{
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDBP.getText() + "','" + BP.getText() + "', '" + PriceBP.getText() + "', '" + PrimechanieBP.getText() + "', '" + DopBP.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e){
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }
                        }


                }

                @FXML
                void ActionSaveCPUPriceButton(ActionEvent event) {
                        if (IDCPU.getText().isEmpty()){
                                try{
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDCPU.getText() + "','" + CPU.getText() + "', '" + PriceCPU.getText() + "', '" + PrimechanieCPU.getText() + "', '" + DopCPU.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e){
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }
                        }

                }

                @FXML
                void ActionSaveCabelPriceButton(ActionEvent event) {
                        if (IDCabeli.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDCabeli.getText() + "','" + Cabel.getText() + "', '" + PriceCabel.getText() + "', '" + PrimechanieCabel.getText() + "', '" + DopCabel.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveColonkiPriceButton(ActionEvent event) {
                        if (IDColonki.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDColonki.getText() + "','" + Colonki.getText() + "', '" + PriceColonki.getText() + "', '" + PrimechanieColonki.getText() + "', '" + DopColonki.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveCoolerPriceButton(ActionEvent event) {
                        if (IDCooler.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDCooler.getText() + "','" + Cooler.getText() + "', '" + PriceCooler.getText() + "', '" + PrimexhanieCooler.getText() + "', '" + DopCooler.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveCorpusPriceButton(ActionEvent event) {
                        if (IDCorpus.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDCorpus.getText() + "','" + Corpus.getText() + "', '" + PriceCorpus.getText() + "', '" + PrimechanieCorpus.getText() + "', '" + DopCorpus.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveCovrikPriceButton(ActionEvent event) {
                        if (IDCovrik.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDCovrik.getText() + "','" + Covrik.getText() + "', '" + PriceCovrik.getText() + "', '" + PrimechanieCovrik.getText() + "', '" + DopCovrik.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }



                @FXML
                void ActionSaveFDDPriceButton(ActionEvent event) {
                        if (IDFDD.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDFDD.getText() + "','" + FDD.getText() + "', '" + PriceFDD.getText() + "', '" + PrimechanieFDD.getText() + "', '" + DopFDD.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveHDDPriceButton(ActionEvent event) {
                        if (IDHDD.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDHDD.getText() + "','" + HDD.getText() + "', '" + PriceHDD.getText() + "', '" + PrimechanieHDD.getText() + "', '" + DopHDD.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveKeyboardPriceButton(ActionEvent event) {
                        if (IDKeyboard.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDKeyboard.getText() + "','" + Keyboard.getText() + "', '" + PriceKeyboard.getText() + "', '" + PrimechanieKeyboard.getText() + "', '" + DopKeyboard.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveMicrofonPriceButton(ActionEvent event) {
                        if (IDMicrofon.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDMicrofon.getText() + "','" + Microfon.getText() + "', '" + PriceMicrofon.getText() + "', '" + PrimechanieMicrofon.getText() + "', '" + DopMicrofon.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveModemPriceButton(ActionEvent event) {
                        if (IDModem.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDModem.getText() + "','" + Modem.getText() + "', '" + PrideModem.getText() + "', '" + PrimechanieModem.getText() + "', '" + DopModem.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveMonitorPriceButton(ActionEvent event) {
                        if (IDMonitor.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDMonitor.getText() + "','" + Monitor.getText() + "', '" + MonitorPrice.getText() + "', '" + PrimechanieMonitor.getText() + "', '" + DopMonitor.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveMousePriceButton(ActionEvent event) {
                        if (IDMouse.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDMouse.getText() + "','" + Mouse.getText() + "', '" + PriceMouse.getText() + "', '" + PrimechanieMouse.getText() + "', '" + DopMouse.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveNetworkcardPriceButton(ActionEvent event) {
                        if (IDNetworkcard.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDNetworkcard.getText() + "','" + Networkcard.getText() + "', '" + PriceNetworkcard.getText() + "', '" + PrimechanieNetworkcard.getText() + "', '" + DopNetworkcard.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSavePitaniePriceButton(ActionEvent event) {
                        if (IDPitanie.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDPitanie.getText() + "','" + Pitanie.getText() + "', '" + PricePitanie.getText() + "', '" + PrimechaniePitanie.getText() + "', '" + DopPitanie.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSavePlataPriceButton(ActionEvent event) {
                        if (IDPlata.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDPlata.getText() + "','" + Plata.getText() + "', '" + PlataPrice.getText() + "', '" + PrimechaniePrice.getText() + "', '" + DopPrice.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSavePrinterPriceButton(ActionEvent event) {
                        if (IDPrinter.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDPrinter.getText() + "','" + Printer.getText() + "', '" + PricePrinter.getText() + "', '" + PrimechaniePrinter.getText() + "', '" + DopPrinter.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveRAMPriceButton(ActionEvent event) {
                        if (IDRAM.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDRAM.getText() + "','" + RAM.getText() + "', '" + PriceRAM.getText() + "', '" + PrimechanieRAM.getText() + "', '" + DopRAM.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveScanerPriceButton(ActionEvent event) {
                        if (IDScaner.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDScaner.getText() + "','" + Scaner.getText() + "', '" + PriceScaner.getText() + "', '" + PrimechanieScaner.getText() + "', '" + DopScaner.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveSoftPriceButton(ActionEvent event) {
                        if (IDSoft.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDSoft.getText() + "','" + Soft.getText() + "', '" + PriceSoft.getText() + "', '" + PrimechanieSoft.getText() + "', '" + DopSoft.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                public void ActionSaveToDatabaseOrderButton(ActionEvent event) {
                        RaschetBorderPane.setVisible(false);
                        BorderPaneAddOrder.setVisible(true);
                }

                @FXML
                void ActionSaveVideocardPriceButton(ActionEvent event) {
                        if (IDVideocard.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDVideocard.getText() + "','" + Videocard.getText() + "', '" + PriceVideocard.getText() + "', '" + PrimechanieVideocard.getText() + "', '" + DopVideocard.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

                @FXML
                void ActionSaveVolumecardPriceButton(ActionEvent event) {
                        if (IDVolumecard.getText().isEmpty()) {
                                try {
                                        Connection connection = DriverManager.getConnection(str, login, passw);
                                        Statement statement = connection.createStatement();
                                        String a = ("INSERT INTO products (IDProduct, NameProduct, TypeProduct, PriceProduct, PrimechanieProduct, DopProduct) " +
                                                "VALUES ('" + IDVolumecard.getText() + "','" + Volumecard.getText() + "', '" + PriceVolumecard.getText() + "', '" + PrimechanieVolumecard.getText() + "', '" + DopVolumecard.getText() + "')");
                                        System.out.println(a);
                                        statement.executeUpdate(a);
                                        connection.close();
                                } catch (SQLException e) {
                                        throw new RuntimeException("Error while executing SQL query", e);
                                }

                        }

                }

        int id = 0;
        public void MouseCPU(javafx.scene.input.MouseEvent mouseEvent) {
                id = TableCPUPrice.getSelectionModel().getSelectedItem().IDCPU;

        }

        public void ExitedCPU(MouseEvent mouseEvent) {
                System.out.println(12);
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableCPUPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'Cpu', PriceProduct='"+TableCPUPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableCPUPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableCPUPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseCooler(javafx.scene.input.MouseEvent mouseEvent) {
                id = TableCoolerPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void CoolerExited(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableCoolerPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'Cooler', " +
                                "PriceProduct='"+TableCoolerPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableCoolerPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableCoolerPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseCabeli(MouseEvent mouseEvent) {
                id = TableCabeliPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void CabeliExited(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableCabeliPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'Cabeli', " +
                                "PriceProduct='"+TableCabeliPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableCabeliPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableCabeliPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseCorpus(MouseEvent mouseEvent) {
                id = TableCorpusPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void CorpusExited(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableCorpusPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'Corpus', " +
                                "PriceProduct='"+TableCorpusPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableCorpusPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableCorpusPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseFDD(MouseEvent mouseEvent) {
                id = TableFDDPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedFDD(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableFDDPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'fdd', " +
                                "PriceProduct='"+TableFDDPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableFDDPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableFDDPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseHDD(MouseEvent mouseEvent) {
                id = TableHDDPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedHDD(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableHDDPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'hdd', " +
                                "PriceProduct='"+TableHDDPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableHDDPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableHDDPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseKeyboard(MouseEvent mouseEvent) {
                id = TableKeyboardPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedKeyboard(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableKeyboardPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'keyboard', " +
                                "PriceProduct='"+TableKeyboardPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableKeyboardPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableKeyboardPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MousePlata(MouseEvent mouseEvent) {
                id = TablePlataPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedPlata(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TablePlataPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'plata', " +
                                "PriceProduct='"+TablePlataPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TablePlataPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TablePlataPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseModem(MouseEvent mouseEvent) {
                id = TableModemPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedModem(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableModemPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'modem', " +
                                "PriceProduct='"+TableModemPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableModemPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableModemPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseMonitor(MouseEvent mouseEvent) {
                id = TableMonitorPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedMonitor(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableMonitorPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'monitor', " +
                                "PriceProduct='"+TableMonitorPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableMonitorPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableMonitorPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseMouse(MouseEvent mouseEvent) {
                id = TableMousePrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedMouse(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableMousePrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'mouse', " +
                                "PriceProduct='"+TableMousePrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableMousePrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableMousePrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseMicrofon(MouseEvent mouseEvent) {
                id = TableMicrofonPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedMicrofon(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableMicrofonPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'microfon', " +
                                "PriceProduct='"+TableMicrofonPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableMicrofonPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableMicrofonPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseNetworkcard(MouseEvent mouseEvent) {
                id = TableNetworkcardPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedNetworkcard(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableNetworkcardPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'netcard', " +
                                "PriceProduct='"+TableNetworkcardPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableNetworkcardPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableNetworkcardPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseCovrik(MouseEvent mouseEvent) {
                id = TableCovrikPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedCovrik(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableCovrikPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'covrik', " +
                                "PriceProduct='"+TableCovrikPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableCovrikPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableCovrikPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseBP(MouseEvent mouseEvent) {
                id = TableBPPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedBP(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableBPPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'bp', " +
                                "PriceProduct='"+TableBPPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableBPPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableBPPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MousePrinter(MouseEvent mouseEvent) {
                id = TablePrinterPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedPrinter(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TablePrinterPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'printer', " +
                                "PriceProduct='"+TablePrinterPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TablePrinterPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TablePrinterPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseRAM(MouseEvent mouseEvent) {
                id = TableRAMPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedRAM(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableRAMPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'ram', " +
                                "PriceProduct='"+TableRAMPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableRAMPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableRAMPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseVolumecard(MouseEvent mouseEvent) {
                id = TableVolumecardPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedVolumecard(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableVolumecardPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'volcard', " +
                                "PriceProduct='"+TableVolumecardPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableVolumecardPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableVolumecardPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseScaner(MouseEvent mouseEvent) {
                id = TableScanerPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedScaner(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableScanerPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'scaner', " +
                                "PriceProduct='"+TableScanerPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableScanerPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableScanerPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseSoft(MouseEvent mouseEvent) {
                id = TableSoftPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedSoft(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableSoftPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'soft', " +
                                "PriceProduct='"+TableSoftPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableSoftPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableSoftPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseColonki(MouseEvent mouseEvent) {
                id = TableColonkiPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedColonki(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableColonkiPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'colonki', " +
                                "PriceProduct='"+TableColonkiPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableColonkiPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableColonkiPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MousePitanie(MouseEvent mouseEvent) {
                id = TablePitaniePrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedPitanie(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TablePitaniePrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'pitanie', " +
                                "PriceProduct='"+TablePitaniePrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TablePitaniePrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TablePitaniePrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseVideocard(MouseEvent mouseEvent) {
                id = TableVideocardPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedVideocard(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableVideocardPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'videocard', " +
                                "PriceProduct='"+TableVideocardPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableVideocardPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableVideocardPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        public void MouseSDD(MouseEvent mouseEvent) {
                id = TableSDDPrice.getSelectionModel().getSelectedItem().IDCPU;
        }

        public void ExitedSDD(MouseEvent mouseEvent) {
                try {
                        Connection connection = DriverManager.getConnection(str, login, passw);
                        Statement statement = connection.createStatement();
                        statement.executeUpdate("UPDATE products " +
                                "Set NameProduct= '"+TableSDDPrice.getSelectionModel().getSelectedItem().CPU.get()+"', " +
                                "TypeProduct= 'ssd', " +
                                "PriceProduct='"+TableSDDPrice.getSelectionModel().getSelectedItem().PriceCPU+"', " +
                                "PrimechanieProduct= '"+TableSDDPrice.getSelectionModel().getSelectedItem().PrimechanieCPU.get()+"', " +
                                "DopProduct= '"+TableSDDPrice.getSelectionModel().getSelectedItem().DopCPU.get()+"' WHERE IDProduct = "+id+";");

                        connection.close();

                }
                catch (SQLException e){
                        System.out.println(e);

                }
        }

        int id2 = 0;
        public void ActionRaschetFormOplati(ActionEvent event) {
                RaschetFormOplati.getValue();
        }

        public void ActionRaschetNumberOrder(ActionEvent event) {
        }

        public void ActionRaschetColvo(ActionEvent event) {
                Multiply();
        }

        private ObservableList<CPUTable> DatatableTovar = FXCollections.observableArrayList();
        float summ = 0;
        public void Summirovanie(){
                summ = Float.parseFloat(PriceCPUField.getText()) + Float.parseFloat(PriceCoolerField.getText()) + Float.parseFloat(PriceHDDField.getText()) + Float.parseFloat(PricePlataField.getText()) + Float.parseFloat(PriceRAMField.getText()) +
                        Float.parseFloat(PriceVideocardField.getText()) + Float.parseFloat(PriceSSDField.getText()) + Float.parseFloat(PriceCorpusField.getText()) + Float.parseFloat(PriceMonitorField.getText()) + Float.parseFloat(PriceVolumecardField.getText()) + Float.parseFloat(PriceMicrofonField.getText()) + Float.parseFloat(PriceColonkiField.getText()) + Float.parseFloat(PriceKeyboardField.getText()) + Float.parseFloat(PriceMouseField.getText()) + Float.parseFloat(PriceCovrikField.getText()) + Float.parseFloat(PricePrinterField.getText()) + Float.parseFloat(PriceBPField.getText()) + Float.parseFloat(PricePitanieField.getText()) +
                        Float.parseFloat(PriceNetworkcardField.getText()) + Float.parseFloat(PriceModemField.getText()) + Float.parseFloat(PriceDopcabeliField.getText()) + Float.parseFloat(PriceSoftField.getText()) + Float.parseFloat(PriceScanerField.getText()) + Float.parseFloat(PriceFDDField.getText()) + Float.parseFloat(PriceEtcField.getText());
                RaschetSumm.setText("");
                RaschetSumm.setText(String.valueOf(summ));
                Multiply();
        }
        float multi = 0;
        public void Multiply(){
                multi = summ * Float.parseFloat(RaschetColvo.getText());
                RaschetItogo.setText(String.valueOf(multi));
        }
        public void ActionRaschetCPUField(ActionEvent event) {
                if (!RaschetCPUField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetCPUField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceCPUField.setText(String.valueOf(dataTable.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceCPUField.setText("0");
                }
                Summirovanie();

        }

        public void ActionRaschetCoolerField(ActionEvent event) {
                if (!RaschetCoolerField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable1 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetCoolerField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable1.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceCoolerField.setText(String.valueOf(dataTable1.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else{
                        PriceCoolerField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetHDDField(ActionEvent event) {
                if (!RaschetHDDField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable6 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetHDDField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable6.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceHDDField.setText(String.valueOf(dataTable6.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceHDDField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetPlataField(ActionEvent event) {
                if (!RaschetPlataField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable9 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetPlataField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable9.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PricePlataField.setText(String.valueOf(dataTable9.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PricePlataField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetRAMField(ActionEvent event) {
                if (!RaschetRAMField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable18 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetRAMField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable18.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceRAMField.setText(String.valueOf(dataTable18.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceRAMField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetVideocardField(ActionEvent event) {
                if (!RaschetVideocardField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable23 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetVideocardField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable23.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceVideocardField.setText(String.valueOf(dataTable23.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceVideocardField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetSSDField(ActionEvent event) {
                if (!RaschetSSDField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable24 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetSSDField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable24.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceSSDField.setText(String.valueOf(dataTable24.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else{
                        PriceSSDField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetCorpusField(ActionEvent event) {
                if (!RaschetCorpusField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable2 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetCorpusField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable2.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceCorpusField.setText(String.valueOf(dataTable2.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceCorpusField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetMonitorField(ActionEvent event) {
                if (!RaschetMonitorField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable10 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetMonitorField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable10.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceMonitorField.setText(String.valueOf(dataTable10.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceMonitorField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetVolumecardField(ActionEvent event) {
                if (!RaschetVolumecardField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable18 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetVolumecardField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable18.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceVolumecardField.setText(String.valueOf(dataTable18.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else{
                        PriceVolumecardField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetMicrofonField(ActionEvent event) {
                if (!RaschetMicrofonField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable12 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetMicrofonField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable12.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceMicrofonField.setText(String.valueOf(dataTable12.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceMicrofonField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetColonkiField(ActionEvent event) {
                if (!RaschetColonkiField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable21 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetColonkiField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable21.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceColonkiField.setText(String.valueOf(dataTable21.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceColonkiField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetKeyboardField(ActionEvent event) {
                if (!RaschetKeyboardField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable7 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetKeyboardField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable7.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceKeyboardField.setText(String.valueOf(dataTable7.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceKeyboardField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetMouseField(ActionEvent event) {
                if (!RaschetMouseField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable11 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetMouseField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable11.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceMouseField.setText(String.valueOf(dataTable11.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceMouseField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetCovrikField(ActionEvent event) {
                if (!RaschetCovrikField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable14 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetCovrikField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable14.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceCovrikField.setText(String.valueOf(dataTable14.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceCovrikField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetPrinterField(ActionEvent event) {
                if (!RaschetPrinterField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable16 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetPrinterField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable16.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PricePrinterField.setText(String.valueOf(dataTable16.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PricePrinterField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetBPField(ActionEvent event) {
                if (!RaschetBPField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable15 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetBPField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable15.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceBPField.setText(String.valueOf(dataTable15.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else{
                        PriceBPField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetPitanieField(ActionEvent event) {
                if (!RaschetPitanieField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable22 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetPitanieField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable22.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PricePitanieField.setText(String.valueOf(dataTable22.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PricePitanieField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetNetworkcardField(ActionEvent event) {
                if (!RaschetNetworkcardField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable13 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetNetworkcardField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable13.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceNetworkcardField.setText(String.valueOf(dataTable13.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceNetworkcardField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetModemField(ActionEvent event) {
                if (!RaschetModemField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable9 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetModemField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable9.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceModemField.setText(String.valueOf(dataTable9.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceModemField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetDopcabeliField(ActionEvent event) {
                if (!RaschetDopcabeliField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable3 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetDopcabeliField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable3.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceDopcabeliField.setText(String.valueOf(dataTable3.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceDopcabeliField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetSoftField(ActionEvent event) {
                if (!RaschetSoftField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable20 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetSoftField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable20.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceSoftField.setText(String.valueOf(dataTable20.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceSoftField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetScanerField(ActionEvent event) {
                if (!RaschetScanerField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable19 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetScanerField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable19.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceScanerField.setText(String.valueOf(dataTable19.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceScanerField.setText("0");
                }
                Summirovanie();
        }

        public void ActionRaschetFDDField(ActionEvent event) {
                if (!RaschetFDDField.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<CPUTable> dataTable5 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM products WHERE NameProduct = '" + RaschetFDDField.getValue() + "'");
                                while (rs.next()) {
                                        dataTable5.add(new CPUTable(rs.getInt("IDProduct"), rs.getString("NameProduct"), rs.getString("TypeProduct"),
                                                rs.getFloat("PriceProduct"), rs.getString("PrimechanieProduct"), rs.getString("DopProduct")));
                                }
                                connection.close();
                                PriceFDDField.setText(String.valueOf(dataTable5.get(0).PriceCPU));
                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        PriceFDDField.setText("0");
                }
                Summirovanie();
        }

        public void ActionMaxBackOrderButton(ActionEvent event) {
        }

        public void ActionForwardOrderButton(ActionEvent event) {
        }

        public void ActionMaxForwardOrderButton(ActionEvent event) {
        }

        public void ActionPriceEtcField(ActionEvent event) {
                Summirovanie();
        }


        public void EnteredPriceEtc(MouseEvent mouseEvent) {
                Summirovanie();
        }


        public void ReleasedPriceEtc(KeyEvent keyEvent) {
                Summirovanie();
        }

        public void ReleasedColvoRaschet(KeyEvent keyEvent) {
                Multiply();
        }


        public void ActionAllClientsAddOrder(ActionEvent event) {
                if (!AllClientsAddOrder.getValue().isEmpty()) {
                        try {
                                Connection connection = DriverManager.getConnection(str, login, passw);
                                ObservableList<AllClients> dataTable25 = FXCollections.observableArrayList();
                                Statement statement = connection.createStatement();
                                ResultSet rs = statement.executeQuery("SELECT * FROM allclients WHERE FIOClient = '" + AllClientsAddOrder.getValue() + "'");
                                while (rs.next()) {
                                        dataTable25.add(new AllClients(rs.getInt("IdClient"), rs.getString("FIOClient"), rs.getString("Contact"),
                                                rs.getString("Commentary"), rs.getString("DataSdachi"), rs.getFloat("Predoplatasql")));
                                }
                                connection.close();
                                ClientAddOrder.setText(String.valueOf(dataTable25.get(0).FIOClient));
                                ContactAddOrder.setText(String.valueOf(dataTable25.get(0).Contact));
                                CommAddOrder.setText(String.valueOf(dataTable25.get(0).Commentary));

                        } catch (SQLException e) {
                                System.out.println(e);
                        }
                }
                else {
                        ClientAddOrder.setText("");
                        ContactAddOrder.setText("");
                        CommAddOrder.setText("");
                }


        }
        public class AutoCompleteComboBoxListener<T> implements EventHandler<KeyEvent> {

                private ComboBox<T> comboBox;
                private ObservableList<T> data;
                private boolean moveCaretToPos = false;
                private int caretPos;

                public AutoCompleteComboBoxListener(final ComboBox<T> comboBox) {
                        this.comboBox = comboBox;
                        data = comboBox.getItems();

                        this.comboBox.setEditable(true);
                        this.comboBox.setOnKeyPressed(new EventHandler<KeyEvent>() {

                                @Override
                                public void handle(KeyEvent t) {
                                        comboBox.hide();
                                }
                        });
                        this.comboBox.setOnKeyReleased(AutoCompleteComboBoxListener.this);
                }

                @Override
                public void handle(KeyEvent event) {

                        if(event.getCode() == KeyCode.UP) {
                                caretPos = -1;
                                moveCaret(comboBox.getEditor().getText().length());
                                return;
                        } else if(event.getCode() == KeyCode.DOWN) {
                                if(!comboBox.isShowing()) {
                                        comboBox.show();
                                }
                                caretPos = -1;
                                moveCaret(comboBox.getEditor().getText().length());
                                return;
                        } else if(event.getCode() == KeyCode.BACK_SPACE) {
                                moveCaretToPos = true;
                                caretPos = comboBox.getEditor().getCaretPosition();
                        } else if(event.getCode() == KeyCode.DELETE) {
                                moveCaretToPos = true;
                                caretPos = comboBox.getEditor().getCaretPosition();
                        }

                        if (event.getCode() == KeyCode.RIGHT || event.getCode() == KeyCode.LEFT
                                || event.isControlDown() || event.getCode() == KeyCode.HOME
                                || event.getCode() == KeyCode.END || event.getCode() == KeyCode.TAB) {
                                return;
                        }

                        ObservableList<T> list = FXCollections.observableArrayList();
                        for (int i = 0; i < data.size(); i++) {
                                if(data.get(i).toString().toLowerCase().startsWith(
                                        //AutoCompleteComboBoxListener.this.comboBox.getEditor().getText().toLowerCase().trim())) {
                                        comboBox.getEditor().getText().toLowerCase().trim())) {
                                        list.add(data.get(i));
                                }
                        }
                        String t = comboBox.getEditor().getText();

                        comboBox.setItems(list);
                        comboBox.getEditor().setText(t);
                        if(!moveCaretToPos) {
                                caretPos = -1;
                        }
                        moveCaret(t.length());
                        if(!list.isEmpty()) {
                                comboBox.show();
                        }
                }

                private void moveCaret(int textLength) {
                        if(caretPos == -1) {
                                comboBox.getEditor().positionCaret(textLength);
                        } else {
                                comboBox.getEditor().positionCaret(caretPos);
                        }
                        moveCaretToPos = false;
                }

                public static<T> T getComboBoxValue(ComboBox<T> comboBox){
                        if (comboBox.getSelectionModel().getSelectedIndex() < 0) {
                                return null;
                        } else {
                                return comboBox.getItems().get(comboBox.getSelectionModel().getSelectedIndex());
                        }
                }
        }

}
