package ch01.quiz02.case01;


public class ScoreChild extends ScoreParent {
	private int music;
	private int gym;
	
	
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getGym() {
		return gym;
	}
	public void setGym(int gym) {
		this.gym = gym;
	}
	@Override
	public void setSum() {
		// TODO Auto-generated method stub
//		super.setSum();
		sum = super.getSum()+music+gym;
//		sum = kr + eng + math + music + gym;
	}

	@Override
	public void setAvg() {
		// TODO Auto-generated method stub
//		super.setAvg(avg);
		avg = sum/5.0;
	}

	@Override
	public String toString() {
		String msg = "###"+super.getName()+"###\n";
		msg += "총점: "+ sum+"\n";
		msg += "평균 : "+avg +"\n";
		return msg;
	}

	
	
}