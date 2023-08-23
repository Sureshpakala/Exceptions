package ComplieTimeExceptions;

public class StackOverFlowErrorExample {
	public void a() {
		b();
	}
	public void b() {
		a();
	}
}
