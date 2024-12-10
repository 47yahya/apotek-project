CREATE TABLE supplier
(
	nama_industri VARCHAR(20) NOT NULL PRIMARY KEY,
	penanggung_jawab VARCHAR(20) NOT NULL,
	lokasi VARCHAR(20) NOT NULL,
	no_business VARCHAR(12) NOT NULL
);

CREATE TABLE pembelian
(
	id_beli INT(5) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	no_nota_beli VARCHAR(10) NOT NULL,
	tanggal_beli DATE NOT NULL,
	nama_pembeli VARCHAR(20) NOT NULL,
	nama_industri VARCHAR(20) NOT NULL,
	stock_pembelian INT(20) NOT NULL,
	total INT(10) NOT NULL,
	tunai INT(10) NOT NULL,
	kembali INT(10) NOT NULL,
	FOREIGN KEY (nama_industri) REFERENCES supplier (nama_industri)
);

CREATE TABLE admin (

	id_admin VARCHAR(10) NOT NULL PRIMARY KEY,
	username VARCHAR(30) NOT NULL,
	pass_admin VARCHAR(10) NOT NULL
);

CREATE TABLE obat (
	id_obat INT(5) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nama_industri VARCHAR(20) NOT NULL,
	kode_obat VARCHAR(10) NOT NULL UNIQUE,
	nama_obat VARCHAR(20) NOT NULL,
	satuan VARCHAR(10) NOT NULL,
	jenis VARCHAR(10) NOT NULL,
	jumlah_stok_obat INT(10) NOT NULL,
	harga_obat INT(10) NOT NULL,
	FOREIGN KEY (nama_industri) REFERENCES supplier (nama_industri)
);

CREATE TABLE transaksi (
	no_nota VARCHAR(10) NOT NULL PRIMARY KEY,
	kode_obat VARCHAR(10) NOT NULL,
	nama_obat VARCHAR(20) NOT NULL,
	harga_obat INT(10) NOT NULL,
	jumlah_beli INT(10) NOT NULL,
	total_bayar INT(10) NOT NULL,
	FOREIGN KEY (kode_obat) REFERENCES obat (kode_obat)
);

SELECT t.no_nota, o.kode_obat, o.nama_obat, o.harga_obat, t.jumlah_beli, t.total_bayar
FROM transaksi t
JOIN obat o ON t.kode_obat = o.kode_obat;
