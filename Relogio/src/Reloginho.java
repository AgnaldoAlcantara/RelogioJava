class Reloginho {
    private boolean horarioDefinido = false;
    Ponteiro hours = new Ponteiro();
    Ponteiro minutes = new Ponteiro();
    Ponteiro seconds = new Ponteiro();
    Texto texto = new Texto();

    public boolean isHorarioDefinido() {
        return horarioDefinido;
    }

    public void editTime(String hour, String min, String sec) {
        try {
            int h = Integer.parseInt(hour);
            int m = Integer.parseInt(min);
            int s = Integer.parseInt(sec);

            if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
                this.hours.number = h;
                this.minutes.number = m;
                this.seconds.number = s;
                horarioDefinido = true;
            } else {
                System.out.println("Os números não estão dentro do horário permitido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Formato inválido! Certifique-se de usar números.");
        }
    }

    public void mostrarPeriodo(int horas) {
        if (horas >= 0 && horas < 6) {
            System.out.println(" madrugada.");
        } else if (horas >= 6 && horas < 12) {
            System.out.println("manhã.");
        } else if (horas >= 12 && horas < 18) {
            System.out.println("tarde.");
        } else {
            System.out.println("noite.");
        }
    }

    public void inicio() {
        texto.inicio();
    }

    public boolean opcao(String horarioBase) {
        return texto.opcao(horarioBase, this);
    }

    public void horario() {
        System.out.println("Horário atual --> " + this.hours.number + " : " + this.minutes.number + " : " + this.seconds.number);
        System.out.print( "É " + this.hours.number + " e " + this.minutes.number + " da ");
        mostrarPeriodo(this.hours.number);
        System.out.println();
    }
    public void errado(){
        texto.errado();
    }
}

