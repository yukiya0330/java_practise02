package game;

public class Hero {
		private String name;
		private int hp;
		public int getHp() {
			return hp;
		}

		public void setHp(int hp) {
			this.hp = hp;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		private Sword sword;

		public void attack() {
			System.out.println(this.name + "は攻撃した!");
			System.out.println("敵に5ポイントのダメージを与えた!");
		}

		public void sleep() {
			this.hp = 100;
			System.out.println(this.name + "は、眠って回復した！");
		}

		public void sit(int sec) {
			this.hp += sec;
			System.out.println(this.name + "は、" + sec + "秒座った!");
			System.out.println("HPが、" + sec + "ポイント回復した");
		}

		public void slip() {
			this.hp -= 5;
			System.out.println(this.name + "は、転んだ！");
			System.out.println("5のダメージ！");
		}

		public void run() {
			System.out.println(this.name + "は、逃げ出した！");
			System.out.println("最終HPは、" + this.hp + "でした");
		}

		public Hero(String name) {
			this.hp = 100;
			this.name = name;
		}

		 public Hero() {
				this.hp = 100;
				this.name = "ダミー";
		 }

		public Sword getSword() {
			return sword;
		}

		public void setSword(Sword sword) {
			this.sword = sword;
		}
}
