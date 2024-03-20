import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'buka browser (default: chrome)'
WebUI.openBrowser('')

'maximize window size'
WebUI.maximizeWindow()

'go to url --> https://admin-fat.maucash.id/productive-loan/index.html#/'
WebUI.navigateToUrl(GlobalVariable.Url)

//'Pilih Pembiayaan Modal Usaha\n'
//WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_Formulir Pembiayaan Modal Usaha'))
'Pilih Pengajuan Pinjaman'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_pengajuanPinjaman'))

'Pilih Individu'
WebUI.click(findTestObject('Bisnis/span_Badan Usaha'))

'Input nomor hp'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/new/txt_noHandphonePemohon'), noHandphonePemohon)

'klik tombol kirim OTP'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/btn_kirimOTP'))

'input kode otp'
WebUI.setText(findTestObject('Object Repository/Individu/Working Capital/new/txt_kodeOTP'), kodeOTP)

WebUI.takeFullPageScreenshot()

'klik tombol lanjut'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/btn_lanjut'))

'pilih produk pembiayaan'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_produkPembiayaan'))

'pilih working capital'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_workingCapital'))

'pilih tenor pinjaman'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_tenorPinjaman'))

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/li_5 bulan'))

'input jumlah pinjaman'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/txt_amountPinjaman'))

'pilih tujuan pembiayaan'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/slc_tujuaanPembiayaan'))

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/li_Ekspansi Bisnis'))

WebUI.takeFullPageScreenshot()

'klik tombol lanjut'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/new/button_LANJUT_1'))

WebUI.setText(findTestObject('Bisnis/txt_namaBadanUsaha'), 'PT NYOBA')

WebUI.click(findTestObject('Bisnis/slc_bentukBadanUSaha'))

WebUI.click(findTestObject('Bisnis/txt_Commanditer Venotschap (CV)'))

WebUI.setText(findTestObject('Bisnis/txt_NPWP'), '1000100010001000')

WebUI.click(findTestObject('Bisnis/icon_camera'))

WebUI.click(findTestObject('Bisnis/btn_capture'))

WebUI.setText(findTestObject('Bisnis/txt_emailBadanUsaha'), 'nahahahah@gmail.com')

WebUI.setText(findTestObject('Bisnis/txt_alamatTempatUsaha'), 'Jl, Jaku Urang')

'Input Provinsi Tempat Usaha'
WebUI.click(findTestObject('Bisnis/new/input_Provinsi Badan Usaha_el-input__inner'))

WebUI.click(findTestObject('Bisnis/new/span_DKI Jakarta'))

'Input Kota atau Kabupaten Tempat Usaha'
WebUI.click(findTestObject('Bisnis/new/input_Kabupaten atau Kota Badan Usaha_el-input__inner'))

WebUI.click(findTestObject('Bisnis/new/span_Jakarta Barat'))

'Input Kecamatan Tempat Usaha'
WebUI.click(findTestObject('Bisnis/new/input_Kecamatan Badan Usaha_el-input__inner'))

WebUI.click(findTestObject('Bisnis/new/span_Grogol Petamburan'))

'Input Kelurahan Tempat Usaha'
WebUI.click(findTestObject('Bisnis/new/input_Kelurahan Badan Usaha_el-input__inner'))

WebUI.click(findTestObject('Bisnis/new/span_Tanjung Duren Selatan'))

WebUI.setText(findTestObject('Bisnis/new/txt_namaLengkapPenanggungJawabPerusahaan'), 'H. Cecep')

WebUI.setText(findTestObject('Bisnis/new/txt_noHPPenanggungJawabPerusahaan'), '089717178181')

WebUI.setText(findTestObject('Bisnis/new/txt_jabatan'), 'Just an ordinary staff')

'Klik checkbox'
WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/span_Kode Pos Sesuai Tempat Usaha_el-checkb_7a8f53'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Individu/Working Capital/Stage 3/span_Kode Pos Sesuai Tempat Usaha_el-checkb_7a8f53'))
