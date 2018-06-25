package Base;

public class NavigationPage {

    public String getUrl(String pageName) {
        String url = "url";

        switch (pageName) {
            case "HomePage":
                url = "http://www.kearneyevents.net/";
            break;

            case "EventsAndTicketsPage":
                url = "http://www.kearneyevents.net/eventlisting";
            break;

            case "SkatingPage":
                url = "http://www.kearneyevents.net/skating";
            break;

            case "HockeyPage":
                url = "http://www.kearneyevents.net/hockey";
            break;

            case "CampsPage":
                url = "http://www.kearneyevents.net/Camps";
            break;

            case "SuitesPage":
                url = "http://www.kearneyevents.net/suites";
            break;

            case "FAQsPage":
                url = "http://www.kearneyevents.net/faqs";
            break;

            case "AboutPage":
                url = "http://www.kearneyevents.net/About/Employment-Opportunites";
            break;

            case "ContactPage":
                url = "http://www.kearneyevents.net/contact";
            break;
        }

        return url;

    }
}
