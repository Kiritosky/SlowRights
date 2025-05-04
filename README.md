# SlowRights

**SlowRights** ist ein Minecraft-Paper-Plugin, das eine benutzerdefinierte GUI bereitstellt, um die Rechte und Ränge auf einem Server anzuzeigen. Das Plugin ist vollständig konfigurierbar und bietet eine einfache Möglichkeit, Ränge und Berechtigungen zu verwalten.

## Funktionen

- **Befehl `/rechte`**: Öffnet eine GUI, die die Ränge und ihre Berechtigungen anzeigt.
- **Konfigurierbare Items**: Alle Items, Namen, Lores und Slots können in der `config.yml` angepasst werden.
- **Schutz vor Item-Entnahme**: Spieler können keine Items aus der GUI entfernen.

## Installation

1. Lade die `.jar`-Datei des Plugins herunter.
2. Kopiere die Datei in den `plugins`-Ordner deines Paper-Servers.
3. Starte den Server neu, um das Plugin zu laden.
4. Passe die `config.yml` im Plugin-Ordner an, um die GUI nach deinen Wünschen zu gestalten.

## Konfiguration

Die `config.yml` ermöglicht es dir, die GUI vollständig anzupassen. Hier ein Beispiel:

```yaml
items:
  gold_rank:
    slot: 0
    item: GOLD_BLOCK
    name: "&e&lGOLD RANG"
    lore:
      - "&cDieser Rang kostet 101010$"
  fly_permission:
    slot: 1
    item: GREEN_DYE
    name: "&7/fly"
    lore:
      - "&cDamit kannst du Fliegen."