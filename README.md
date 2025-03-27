# 🚀 Automation Testing Project - Voila.id
**Deskripsi singkat**: Proyek ini berfokus pada pengujian otomatis situs web Voila.id menggunakan Katalon Studio. Tujuannya adalah untuk memvalidasi fitur-fitur utama situs web dan memastikan fungsionalitas dan keandalannya. 

## 📋 Struktur Proyek  
- `Test Cases/`: Berisi skenario pengujian.  
- `Keywords/`: Custom keywords untuk reusable scripts.  
- `Object Repository/`: Lokator elemen UI.  

## 🛠️ Prasyarat  
- Katalon Studio versi [v8.0+]. 
- Java JDK 11+ 
- Browser: Chrome/Firefox versi [latest version].  

## ⚡ Cara Menjalankan  
1. Clone repositori ini.  : git Clone https://github.com/nuhaniiy/Katalon-Test-Voila 
2. Buka proyek di Katalon Studio.  
3. Jalankan test suite via:  
   - **GUI**: Klik `Run` di test suite.  
   - **Command Line**:  
     ```bash
     katalon -noSplash -runMode=console -projectPath="Voila.id" -reportFolder="Reports" -testSuitePath="Test Suites/login.ts"  
     ```

## 📊 Hasil Testing  
- Laporan tersimpan di `Reports/` setelah eksekusi.  

## ⁉️ Troubleshooting  
- Jika error "Element not found", periksa `Object Repository` atau versi aplikasi.  