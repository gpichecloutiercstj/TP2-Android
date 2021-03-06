package ca.qc.cstj.android.tp2_android.models;

import com.google.gson.JsonObject;

import org.joda.time.DateTime;

import ca.qc.cstj.android.tp2_android.helpers.DateParser;

/**
 * Created by 1247308 on 2014-10-28.
 */
public class Horaire {

    private String titre;
    private String date1;
    private String heure1;
    private String date2;
    private String heure2;
    private String href;
    private Cinema cinema;
    private Film film;
    private DateTime dateHeure;

    public Horaire(JsonObject jsonObject) {
        href = jsonObject.get("href").getAsString();

        if(jsonObject.has("cinema")) {
            cinema = new Cinema(jsonObject.getAsJsonObject("cinema"));
        }
        if(jsonObject.has("film")) {
            film = new Film(jsonObject.getAsJsonObject("film"));
        }
        if(jsonObject.has("dateHeure")) {
            dateHeure = DateParser.ParseIso(jsonObject.getAsJsonPrimitive("dateHeure").getAsString());
        }

        DateParser dateParser = new DateParser();

                    titre = jsonObject.getAsJsonPrimitive("film").getAsString();
                    nomCinema = jsonObject.getAsJsonPrimitive("cinema").getAsString();
                    DateTime dtDateHeure = DateParser.ParseIso(jsonObject.getAsJsonPrimitive("dateHeure").getAsString());
                    date1 = dateParser.ParseToDate(dtDateHeure);
                    heure1 = dateParser.ParseToTime(dtDateHeure);
                    date2 = dateParser.ParseToDate(dtDateHeure);
                    heure2 = dateParser.ParseToTime(dtDateHeure);
                }
        }

    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }


    public String getDate1() {
        return date1;
    }

    public void setDate1(String date) {
        this.date1 = date;
    }

    public String getHeure1() {
        return heure1;
    }

    public void setHeure1(String heure) {
        this.heure1 = heure;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date) {
        this.date2 = date;
    }

    public String getHeure2() {
        return heure2;
    }

    public void setHeure2(String heure) {
        this.heure2 = heure;

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public DateTime getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(DateTime dateHeure) {
        this.dateHeure = dateHeure;
    }
}
