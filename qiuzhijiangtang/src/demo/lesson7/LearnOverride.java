package demo.lesson7;

public class LearnOverride {
	int param;
	
	int getParam() {
		return this.param;
	}
	
	void setParam(int param) {
		this.param = param;
	}
}

class MySubClass extends LearnOverride {

	@Override
	int getParam() {
		// TODO Auto-generated method stub
		return super.getParam();
	}
	
	@Override
	void setParam(int param) {
		// TODO Auto-generated method stub
		super.setParam(param);
	}
}