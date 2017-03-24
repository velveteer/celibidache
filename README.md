# celibidache

An opinionated starter for writing single-page web applications in [Clojurescript](https://github.com/clojure/clojurescript).

## Includes

* [re-frame](https://github.com/Day8/re-frame) -- Data flow library for [reagent](https://github.com/reagent-project/reagent)
* [bidi](https://github.com/juxt/bidi) & [pushy](https://github.com/kibu-australia/pushy) -- Client-side routing
* [less4clj](https://github.com/Deraen/less4clj) -- LESS compilation
* [cljs-devtools](https://github.com/binaryage/cljs-devtools) -- Enhancements for Clojurescript in Chrome DevTools
* [tachyons](http://tachyons.io/) -- Quickly build and design new UI without writing CSS
* [font-awesome](http://fontawesome.io/) -- The icons you know and love

## Boot Tasks

* `boot dev` -- Compiles and serves target from `localhost:8080`
    * Source maps enabled
    * Re-compiles on file changes
    * Enables CLJS DevTools (remember to enable custom formatters)
    * 404 handler for client-side routing
    * Live reloading of assets and code
* `boot build` -- Compile code for production.
* `boot test-once` -- Run all tests once
* `boot auto-test` -- Run all tests on file changes

## Requirements

* [boot](https://github.com/boot-clj/boot#install)
* [phantomjs](http://phantomjs.org/download.html)

## Other Boot starter templates

* [saapas](https://github.com/Deraen/saapas)
* [jamal](https://github.com/pandeiro/jamal)
* [tenzing](https://github.com/martinklepsch/tenzing)

## License

<p xmlns:dct="http://purl.org/dc/terms/" xmlns:vcard="http://www.w3.org/2001/vcard-rdf/3.0#">
  <a rel="license"
     href="http://creativecommons.org/publicdomain/zero/1.0/">
    <img src="http://i.creativecommons.org/p/zero/1.0/88x31.png" style="border-style: none;" alt="CC0" />
  </a>
</p>

