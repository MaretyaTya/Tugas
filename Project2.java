import java.util.Scanner;
	public class Project {
		static Scanner sc = new Scanner(System.in);

		public static void tampilanMenu(){
			System.out.println("====================================================================");
			System.out.println("====================== PEMESANAN CUSTOM CAKE =======================");
			System.out.println("====================================================================");
			System.out.println(" ");
			System.out.println(" Kue dari bahan berkualitas, kaya rasa dan nikmat dimakan bersama ");
			System.out.println(" 	No. telp : 085987658775 || Web : www.customcake.co.id 		");	
			System.out.println(" ");
			System.out.println("			Aneka macam kue yang bisa anda pilih : 				");
			System.out.println(" ");
			System.out.println("	1. Kue Basah			Rp 25,000/kotak						");
			System.out.println("		(1 kotak terdiri dari 6 macam kue Basah)				");
			System.out.println(" ");
			System.out.println("	2. Kue Kering			Rp 56,000/toples					");
			System.out.println("		(Harga dimulai dari 1 toples)							");
			System.out.println(" ");
			System.out.println("	3. Kue Tart 		Rp 100,000 s.d Rp 450,000				");
			System.out.println("		([KHUSUS TART] Bisa costum kue sesuai keinginan anda)	");	
			System.out.println(" ");
			System.out.println("	4. Kue Muffin 			Rp 40,000/kotak						");
			System.out.println("		(1 kotak berisi 4 kue [Isi bisa berbeda macam rasa])	");	
			System.out.println(" ");
			System.out.println("====================================================================");
		}
		
		static int pilihanMenu(){
			System.out.print("Pilih kue yang anda inginkan (Masukkan angka): ");
			int pilihan = sc.nextInt();
			return pilihan;
		}

		static void pilihMenu (int pilihan) {
			if (pilihan == 1) {
				kueBasah();
			} else if (pilihan == 2) {
				kueKering();
			} else if (pilihan == 3) {
				kueTart();
			}	else if (pilihan == 4) {
				kueMuffin(); 
			}else {
				System.out.print("Maaf pilihan tidak ada di menu, silahkan coba lagi!");
			}
		}

		static void kueBasah(){
			Scanner sc = new Scanner(System.in);
			System.out.println("");
		}

		static void kueKering(){
			Scanner sc = new Scanner(System.in);
			String [] kering = new String [5]


			System.out.println("");
		}

		static void kueTart(){
			Scanner sc = new Scanner (System.in);
				System.out.println("====================================================================");
				System.out.println("====================== PEMESANAN CUSTOM CAKE =======================");
				System.out.println("====================================================================");
				System.out.println("	Ukuran tart yang akan dipesan : 		");
				System.out.println(" ");
				System.out.println("	1. Besar 	()		Rp");
				System.out.println("	2. Sedang	()		Rp");
				System.out.println("	3. Kecil 	()		Rp");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("====================================================================");
				System.out.println("	Rasa tart yang akan dipesan : 		");
				System.out.println(" ");
				System.out.println("	1. Coklat 		()		Rp");
				System.out.println("	2. Vanila		()		Rp");
				System.out.println("	3. Strawberry 	()		Rp");
				System.out.println("	4. Tiramisu 	()		Rp");
				System.out.println("	5. Blackforest	()		Rp");
				System.out.println(" ");
		}

		static void kueMuffin(){
			Scanner sc = new Scanner (System.in);
				System.out.println("====================================================================");
				System.out.println("====================== PEMESANAN CUSTOM CAKE =======================");
				System.out.println("====================================================================");
				System.out.println("	Macam-macam rasa Kue Muffin yang tersedia di toko kami : 		");
				System.out.println("			(Maksimal pemilihan rasa 4 macam)						");
				System.out.println(" ");
				System.out.println("	1. Coklat 		");
				System.out.println("	2. Strawberry	");
				System.out.println("	3. Vanila 		");
				System.out.println("	4. Mentega 		");
				System.out.println("	5. Greentea 	");
				System.out.println("	6. Pisang 		");
				System.out.println(" ");
				System.out.println("====================================================================");

				String [] macam = new String [4];
					for (String i = 0; i <= 4; i++) {
						System.out.print("pilihan rasa ke-" + i + "= ");
						macam4[i] = sc.nextInt();
					}

				System.out.print("Jumlah kotak yang akan dipesan sebanyak = ");
				jumlah4 = sc.nextInt();
				int harga4 = 40000*jumlah4;
				System.out.println("Harga yang harus anda bayar sebanyak = " + harga4);
				harga4 = sc.nextInt();

		}

		static int biodataPemesan(){
			Scanner sc = new Scanner(System.in);
				System.out.println("====================================================================");
				System.out.println("====================== PEMESANAN CUSTOM CAKE =======================");
				System.out.println("====================================================================");
				System.out.println(" ");
				System.out.println("Untuk memesan kue yang telah anda masukkan, harap mengisi data ini :");
				System.out.println(" ");
				System.out.println("Nama Pemesanan 		= ");
				String nama = sc.nextInt();
				System.out.println("Alamat Pemesanan 	= ");
				String alamat = sc.nextInt();
				System.out.println("Telepon Pemesanan	= ");
				String telpon = sc.nextInt();
				System.out.println("====================================================================");
		}

		static void totalPemesanan(){
			if (totalPemesanan1 == kueBasah) {
				int harga1;
				System.out.println("Harga yang harus anda bayar sebanyak = " + harga4);
				totalPemesanan1=sc.nextInt();
			} else if (totalPemesanan2 == kueKering){
				S
				int harga2;
				System.out.println("Harga yang harus anda bayar sebanyak = " + harga4);
				totalPemesanan2=sc.nextInt();
			}
		}

		public static void main(String[] args) {

			do {
				tampilanMenu(); 
				pilihMenu(pilihanMenu());
				biodataPemesan();
			// } while (totalPesanan());
			}
		}
	}
