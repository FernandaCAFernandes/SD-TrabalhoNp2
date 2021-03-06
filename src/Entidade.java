public class Entidade {
	private int cpu;
	private int memoria;
	private int bloqueiaCpu;
	private int bloqueioMemoria;
	private int liberadoCpu;
	private int loberadoMemo;

	public int getLiberadoCpu() {
		return liberadoCpu;
	}

	public void setLiberadoCpu(int liberadoCpu) {
		this.liberadoCpu = liberadoCpu;
	}

	public int getLoberadoMemo() {
		return loberadoMemo;
	}

	public void setLoberadoMemo(int loberadoMemo) {
		this.loberadoMemo = loberadoMemo;
	}

	private int recursoCpu;
	private int recursoMemoria;

	public Entidade(int cpu, int memoria) {
		this.cpu = cpu;
		this.memoria = memoria;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getBloqueiaCpu() {
		return bloqueiaCpu;
	}

	public void setBloqueiaCpu(int bloqueiaCpu) {
		this.bloqueiaCpu = bloqueiaCpu;
	}

	public int getBloqueioMemoria() {
		return bloqueioMemoria;
	}

	public void setBloqueioMemoria(int bloqueioMemoria) {
		this.bloqueioMemoria = bloqueioMemoria;
	}

	public int getRecursoCpu() {
		return recursoCpu;
	}

	public void setRecursoCpu(int recursoCpu) {
		this.recursoCpu = recursoCpu;
	}

	public int getRecursoMemoria() {
		return recursoMemoria;
	}

	public void setRecursoMemoria(int recursoMemoria) {
		this.recursoMemoria = recursoMemoria;
	}

}
