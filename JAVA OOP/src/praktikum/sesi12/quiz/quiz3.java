package praktikum.sesi12.quiz;

// Interface Phone
interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}

// Class Xiaomi yang mengimplementasikan Phone
class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50; // Nilai awal volume
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Volume Xiaomi: " + volume);
            } else {
                System.out.println("Volume maksimal!");
            }
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Volume Xiaomi: " + volume);
            } else {
                System.out.println("Volume minimal!");
            }
        }
    }
}

// Class iPhone yang mengimplementasikan Phone
class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Volume iPhone: " + volume);
            } else {
                System.out.println("Volume maksimal!");
            }
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Volume iPhone: " + volume);
            } else {
                System.out.println("Volume minimal!");
            }
        }
    }
}

// Class Samsung yang mengimplementasikan Phone
class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Volume Samsung: " + volume);
            } else {
                System.out.println("Volume maksimal!");
            }
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Volume Samsung: " + volume);
            } else {
                System.out.println("Volume minimal!");
            }
        }
    }
}

// Class Oppo yang mengimplementasikan Phone
class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Oppo() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Oppo menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Oppo mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Volume Oppo: " + volume);
            } else {
                System.out.println("Volume maksimal!");
            }
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Volume Oppo: " + volume);
            } else {
                System.out.println("Volume minimal!");
            }
        }
    }
}

// Class PhoneUser untuk menggunakan objek Phone
class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        phone.powerOn();
    }

    public void turnOffThePhone() {
        phone.powerOff();
    }

    public void makePhoneLouder() {
        phone.volumeUp();
    }

    public void makePhoneSilent() {
        phone.volumeDown();
    }
}

public class quiz3 {
    public static void main(String[] args) {
        Phone xiaomi = new Xiaomi();
        PhoneUser user = new PhoneUser(xiaomi);

        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();

        System.out.println();

        Phone samsung = new Samsung();
        PhoneUser samsungUser = new PhoneUser(samsung);

        samsungUser.turnOnThePhone();
        samsungUser.makePhoneLouder();
        samsungUser.makePhoneSilent();
        samsungUser.turnOffThePhone();
    }
}
